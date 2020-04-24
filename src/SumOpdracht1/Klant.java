package SumOpdracht1;

public class Klant implements tostring {
    private String naam;
    private String telnummer;
    private String adres;
    private String plaats;

    public Klant(String naam, String telnummer, String adres, String plaats) {
        this.naam = naam;
        this.telnummer = telnummer;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(String telnummer) {
        this.telnummer = telnummer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
    public String toString() {
        return naam + " woont op " + adres + " " + plaats + " en is op dit nummer te bereiken: " + telnummer;
    }

}
