package Main;


public class AutoHuur {
    private Integer aantalDagen;
    private Auto auto;
    private Klant k;

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

    public void setAantalDagen(Integer aD) {
        aantalDagen = aD;
    }

    public Double totaalPrijs() {
        return aantalDagen*auto.getPrijsPerDag() - aantalDagen*auto.getPrijsPerDag()*(k.getKorting()/100);
    }

    public String toString() {
        String s = "";
        if (getGehuurdeAuto() == null) {
            s = "\t er is geen auto bekend \n";
        }
        else {
            s = "\t autotype: " + getGehuurdeAuto().toString() + "\n";
        }
        if (getHuurder() == null) {
            s = s + "\t er is geen huurder bekend \n";
        }
        else {
            s = s + "\t " + getHuurder().toString() + "\n";
        }
        if (aantalDagen == null) {
            s = s + "\t aantal dagen: 0 en dat kost 0.0 \n";
        }
        else {
            s = s + "\t aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        }
        return s;

    }
}