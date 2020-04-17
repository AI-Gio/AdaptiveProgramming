package Main;


public class AutoHuur {
    private int aantalDagen = 3;
    private Auto auto;
    private Klant k;


    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        auto = gA;
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant kl) {
        k = kl;
    }
    public Klant getHuurder() {
        return k;
    }

    public Double totaalPrijs() {
        Double b = aantalDagen * auto.getPrijsPerDag() - (aantalDagen * auto.getPrijsPerDag()) * (k.getKorting() / 100);
        return b;
    }

    public String toString() {
        String s = "";
        if (getGehuurdeAuto() == null) {
            s = "\ter is geen auto bekend \n";
        }
        else {
            s = "\tautotype: " + getGehuurdeAuto().toString();
        }
        if (getHuurder() == null) {
            s = s + "\ter is geen huurder bekend\n";
        }
        else {
            s = s + "\t" + getHuurder().toString() + "\n";
        }
        s = s + "aantal dagen: " + aantalDagen + "en dat kost " + totaalPrijs();
        return s;
    }
}
