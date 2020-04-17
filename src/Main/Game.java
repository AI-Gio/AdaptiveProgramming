package Main;

import java.time.LocalDate;

public class Game {
    private String game;
    private Integer relYear;
    private Double price;
    private Double newprice;

    public void setGame(String game) {
        this.game = game;
    }

    public Integer getRelYear() {
        return relYear;
    }

    public void setRelYear(Integer relYear) {
        this.relYear = relYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNewprice(Double newprice) {
        this.newprice = newprice;
    }



    public Game(String g, Integer rY, Double p) {
        game = g;
        relYear = rY;
        price = p;
    }

    public Double newPrice() {
        newprice = price;
        for (int i = 0; i < (LocalDate.now().getYear() - relYear); i++) {
            newprice = newprice * 0.70;
        }
        return Math.round(newprice * 100.0) / 100.0;
    }

    public String getGame() {
        return game;
    }

    public Double getNewprice() {
        return newprice;
    }

    public String toString() {
        return game + ", uitgegeven in "+ relYear + "; nieuwprijs: " + price + " nu voor: €"+ newprice+ "\n";
    }
}
