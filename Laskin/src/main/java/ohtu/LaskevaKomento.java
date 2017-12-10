package ohtu;

import javax.swing.JTextField;

public abstract class LaskevaKomento implements Komento{
	
	protected Sovelluslogiikka sovelluslogiikka;
	protected JTextField tuloskentta;
	protected JTextField syotekentta;
	
	protected int arvo;

	public LaskevaKomento(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
		this.sovelluslogiikka = sovelluslogiikka;
		this.tuloskentta = tuloskentta;
		this.syotekentta = syotekentta;
	}

	@Override
	public void suorita() {
		try {
			arvo = Integer.parseInt(syotekentta.getText());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		syotekentta.setText("");
		tuloskentta.setText(""+laske());
	}
	
	@Override
	public void peru() {
		syotekentta.setText("");
		tuloskentta.setText(""+kumoa());
	}
	
	// Palauttaa tuloksen kumoamisen jälkeen
	public abstract int kumoa();
	
	public abstract int laske();
	
}
