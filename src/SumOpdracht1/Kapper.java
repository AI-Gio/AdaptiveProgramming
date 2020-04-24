package SumOpdracht1;

public class Kapper implements tostring {
    private String naam;

    public Kapper(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return "U wordt behandelt door " + naam;
    }
}
