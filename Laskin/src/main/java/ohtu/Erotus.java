package ohtu;

import javax.swing.JTextField;

public class Erotus extends LaskevaKomento{

	public Erotus(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
		super(sovelluslogiikka, tuloskentta, syotekentta);
	}

	@Override
	public int laske() {
		super.sovelluslogiikka.miinus(super.arvo);
		return super.sovelluslogiikka.tulos();
	}

	@Override
	public void peru() {
		
	}

}
