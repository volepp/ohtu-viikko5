package ohtu.kivipaperisakset.pelimuoto;

import java.util.Scanner;

import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.tekoaly.TekoalyParannettu;

public abstract class KPSPelimuoto {

	protected static final Scanner scanner = new Scanner(System.in);
	
	public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String[] siirrot = lueSiirrot();

        while (onkoOkSiirto(siirrot[0]) && onkoOkSiirto(siirrot[1])) {
            tuomari.kirjaaSiirto(siirrot[0], siirrot[1]);
            System.out.println(tuomari);
            System.out.println();

            siirrot = lueSiirrot();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
	
	protected abstract String[] lueSiirrot();
	
	private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
	
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
