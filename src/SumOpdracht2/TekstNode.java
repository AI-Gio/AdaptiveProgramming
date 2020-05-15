package SumOpdracht2;

import java.util.HashMap;
import java.util.Map;

public class TekstNode {
    private String naam;
    private boolean endnode;
    private HashMap<TekstNode, Character> Tovergangen = new HashMap<>();

    public TekstNode(String naam) {this.naam = naam;}

    public TekstNode next(Character choice) {
        TekstNode nextnode = null;
        for (Map.Entry<TekstNode, Character> entry : Tovergangen.entrySet()) {
            TekstNode node = entry.getKey();
            Character path = entry.getValue();
            if (choice.equals(path)) {
                nextnode = node;
                break;
            }
        }
        if (nextnode == null) {
            return null;
        }
        return nextnode;
    }

    public String getNaam() {
        return naam;
    }

    public void addovergangTekst(TekstNode tekstNode, Character letter) {
        Tovergangen.put(tekstNode, letter);
    }

    public boolean getEndnode() {
        return endnode;
    }
}
