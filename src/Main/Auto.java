package Main;

public class Auto {
    private String type;
    private Double prijsPerDag;

    public Auto(String tp, Double prPd) {
        type = tp;
        prijsPerDag = prPd;
    }

    public void setPrijsPerDag(Double prPd) {
        prijsPerDag = prPd;
    }

    public Double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
