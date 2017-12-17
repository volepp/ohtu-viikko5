package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.pelimuoto.KPSParempiTekoaly;
import ohtu.kivipaperisakset.pelimuoto.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.pelimuoto.KPSPelimuoto;
import ohtu.kivipaperisakset.pelimuoto.KPSTekoaly;

public class KPS {

	public static KPSPelimuoto luoPelaajaVsPelaaja() {
		return new KPSPelaajaVsPelaaja();
	}
	
	public static KPSPelimuoto luoPelaajaVsYksinkertainenTekoaly() {
		return new KPSTekoaly();
	}
	
	public static KPSParempiTekoaly luoPelaajaVsParempiTekoaly() {
		return new KPSParempiTekoaly();
	}
	
}
