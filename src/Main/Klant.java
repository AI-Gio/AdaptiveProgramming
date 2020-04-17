package Main;

public class Klant {
    private String naam;
    private Double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(Double kP) {
        kortingsPercentage = kP;
    }

    public String toString() {
        return "op naam van: " + naam + "(korting: " + kortingsPercentage + "%)";
    }
}
