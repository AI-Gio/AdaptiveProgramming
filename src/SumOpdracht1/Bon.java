package SumOpdracht1;

public class Bon extends Btw implements tostring {
    private Afspraak afspraak;
    private Behandeling behandeling;

    public Bon(Afspraak afs, Behandeling beh) {
        afspraak = afs;
        behandeling = beh;
    }

    public String toString() {
        return afspraak.toString() + "Btw: 6%" + "\n" + "Totaal bedrag: " + behandeling.getPrijs() * super.btw + "\n" +
                "---------------------------------------------------------------";
    }

}
