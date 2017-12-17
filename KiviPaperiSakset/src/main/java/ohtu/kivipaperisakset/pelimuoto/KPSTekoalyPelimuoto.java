package ohtu.kivipaperisakset.pelimuoto;

import ohtu.kivipaperisakset.tekoaly.Tekoaly;

public class KPSTekoalyPelimuoto extends KPSPelimuoto{
	
	private Tekoaly tekoaly;

	public KPSTekoalyPelimuoto(Tekoaly tekoaly) {
		this.tekoaly = tekoaly;
	}
	
	@Override
	protected String[] lueSiirrot() {
		String[] siirrot = new String[2];
		
		System.out.print("Ensimmäisen pelaajan siirto: ");
        siirrot[0] = scanner.nextLine();

        siirrot[1] = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirrot[1]);
        
        tekoaly.asetaSiirto(siirrot[0]);
        
		return siirrot;
	}
	
}
