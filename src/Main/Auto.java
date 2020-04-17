package Main;

public class Auto {
    private String type;
    private Double prijsPerDag;

    public Auto(String tp, Double prPd) {
        type = tp;
        prijsPerDag = prPd;

    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(Double prPd) {
        prijsPerDag = prPd;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}