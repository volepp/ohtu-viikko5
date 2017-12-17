package ohtu.kivipaperisakset.tekoaly;

public class TekoalyYksinkertainen implements Tekoaly{

    int siirto;

    public TekoalyYksinkertainen() {
        siirto = 0;
    }

    @Override
    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    @Override
	public void asetaSiirto(String ekanSiirto) {
    }
}
