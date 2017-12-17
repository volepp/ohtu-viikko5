
package ohtu.kivipaperisakset.tekoaly;

// "Muistava tekoäly"

public class TekoalyParannettu implements Tekoaly {
	private String[] muisti;
	private int vapaaMuistiIndeksi;

	public TekoalyParannettu(int muistinKoko) {
		muisti = new String[muistinKoko];
		vapaaMuistiIndeksi = 0;
	}

	public void asetaSiirto(String siirto) {
		// jos muisti täyttyy, unohdetaan viimeinen alkio
		if (vapaaMuistiIndeksi == muisti.length) {
			for (int i = 1; i < muisti.length; i++) {
				muisti[i - 1] = muisti[i];
			}

			vapaaMuistiIndeksi--;
		}

		muisti[vapaaMuistiIndeksi] = siirto;
		vapaaMuistiIndeksi++;
	}

	private int[] laskeKPS() {
		int[] kps = new int[3];
		// Kivet
		kps[0] = 0;
		// Paperit
		kps[1] = 0;
		// Sakset
		kps[2] = 0;

		for (int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
			if (getViimeisinSiirto().equals(muisti[i])) {
				String seuraava = muisti[i + 1];

				if ("k".equals(seuraava)) {
					kps[0]++;
				} else if ("p".equals(seuraava)) {
					kps[1]++;
				} else {
					kps[2]++;
				}
			}
		}
		
		return kps;
	}
	
	private String getViimeisinSiirto() {
		return muisti[vapaaMuistiIndeksi - 1];
	}

	@Override
	public String annaSiirto() {
		if (vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
			return "k";
		}
		
		int[] kps = laskeKPS();

		// Tehdään siirron valinta esimerkiksi seuraavasti;
		// - jos kiviä eniten, annetaan aina paperi
		// - jos papereita eniten, annetaan aina sakset
		// muulloin annetaan aina kivi
		if (kps[0] > kps[1] && kps[0] > kps[2]) {
			return "p";
		} else if (kps[1] > kps[0] && kps[1] > kps[2]) {
			return "s";
		} else {
			return "k";
		}

		// Tehokkaampiakin tapoja löytyy, mutta niistä lisää
		// Johdatus Tekoälyyn kurssilla!
	}
}