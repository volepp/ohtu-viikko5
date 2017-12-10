package ohtu;

import javax.swing.JTextField;

public class Summa extends LaskevaKomento{

	public Summa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
		super(sovelluslogiikka, tuloskentta, syotekentta);
	}

	@Override
	public int laske() {
		super.sovelluslogiikka.plus(super.arvo);
		return super.sovelluslogiikka.tulos();
	}

	public int kumoa() {
		sovelluslogiikka.miinus(arvo);
		return sovelluslogiikka.tulos();
	}
	
}
