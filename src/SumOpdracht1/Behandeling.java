package SumOpdracht1;

public class Behandeling implements tostring {
    private double prijs;
    private String type;
    private int duratie;

    public Behandeling(double prijs, String type, int duratie) {
        this.prijs = prijs;
        this.type = type;
        this.duratie = duratie;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuratie() {
        return duratie;
    }

    public void setDuratie(int duratie) {
        this.duratie = duratie;
    }

    public String toString() {
        return "De behandeling " + type + " zal ongeveer " + duratie + " min duren en is: $" + prijs;
    }
}
