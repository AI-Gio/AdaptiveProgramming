package sumoprachtFOUT;

import java.util.HashMap;

public class TekstNode {
    private String naam;
    private HashMap<TekstNode, String> Tovergangen = new HashMap<>();

    public TekstNode(String naam) {
        this.naam = naam;
    }

    public void addovergangTekst(TekstNode tekstNode, String letter) {
        Tovergangen.put(tekstNode, letter);
    }
}
