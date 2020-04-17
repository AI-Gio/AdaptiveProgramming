package Main;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private Double budget;
    private ArrayList<String> bezit = new ArrayList<>();
    private Game game;

    public Persoon(String n, Double b) {
        naam = n;
        budget = b;
        toString();
    }

    public String koop(Game game) {
        if (bezit.contains(game.getGame())) {
            return "Niet gelukt";
        }
        else if (budget < game.newPrice()) {
            return "Niet gelukt";
        }
        else {
            budget = budget - game.newPrice();
            bezit.add(game.getGame());
            return "Gelukt";
        }
    }

    public String verkoop(Game game, Persoon koper) {
        if (!bezit.contains(game.getGame())) {
            return "Niet gelukt";
        }
        else if (!koper.bezit.contains(game.getGame())){
            return "Niet gelukt";
        }
        else if (koper.budget < game.newPrice()){
            return "Niet Gelukt";
        }
        else{
            budget = budget + game.newPrice();
            koper.budget = koper.budget - game.newPrice();
            bezit.remove(game.getGame());
            return "Gelukt";
        }
    }

    public String toString() {
        String s = "";
        s = s + naam + " heeft een budget van €" + Math.round(budget * 100.0) / 100.0 + " en bezit de volgende games:\n";
        for (String i : bezit) {
            s = s + i;
        }
        return s;
    }
}
