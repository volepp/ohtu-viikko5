package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento{

	private Sovelluslogiikka sovelluslogiikka;
	private JTextField tuloskentta;
	private JTextField syotekentta;

	public Nollaa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
		this.sovelluslogiikka = sovelluslogiikka;
		this.tuloskentta = tuloskentta;
		this.syotekentta = syotekentta;
	}
	
	@Override
	public void suorita() {
		sovelluslogiikka.nollaa();
		tuloskentta.setText("");
		syotekentta.setText("");
	}

	@Override
	public void peru() {
		
	}

}
