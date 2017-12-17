package ohtu.kivipaperisakset.pelimuoto;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPelimuoto{

	@Override
	protected String[] lueSiirrot() {
		String[] siirrot = new String[2];
		
		System.out.print("Ensimmäisen pelaajan siirto: ");
        siirrot[0]= scanner.nextLine();
        System.out.print("Toisen pelaajan siirto: ");
        siirrot[1] = scanner.nextLine();

		return siirrot;
	}
}