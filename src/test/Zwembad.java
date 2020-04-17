package test;

public class Zwembad {
    private Double Diepte;
    private Double Lengte;
    private Double Breedte;

    public Zwembad(Double Br, Double Le, Double Di)
    {
        Diepte = Di;
        Lengte = Le;
        Breedte = Br;
    }

    public String getDiepte() {
        return "DIEPTE: " + Diepte;
    }

    public String getLengte() {
        return "LENGTE: " + Lengte;
    }

    public String getBreedte() {
        return "BREEDTE: " + Breedte;
    }

    public String Inhoud() {
        Double s = Diepte * Lengte * Breedte;
        return "BEREKENDE INHOUD: " + Double.toString(s);
    }

    public void setDiepte(Double nwDi) {Diepte = nwDi;}
    public void setLengte(Double nwLe) {Lengte = nwLe;}
    public void setBreedte(Double nwBr) {Breedte = nwBr;}

    public String toString() {
        String p = "GEGEVENS ZWEMBAD: Dit zwembad is "+ Breedte +" meter breed, " + Lengte +
                " meter lang, en " + Diepte + " meter diep";
        return p;
    }

}
