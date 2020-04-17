package Main;

public class Klant {
    private String naam;
    private Double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public void setKorting(Double kP) {
        kortingsPercentage = kP;
    }

    public Double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return "op naam van: " + naam + "(korting: "+ kortingsPercentage + "%)";
    }
}
