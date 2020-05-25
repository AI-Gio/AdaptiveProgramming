package SumOpdracht2;

import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Map;

public class TekstNode {
    private String naam;
    private boolean endnode;
    private HashMap<TekstNode, Character> Tovergangen = new HashMap<>();

    public TekstNode(String naam, Boolean endnode) {
        this.naam = naam;
        this.endnode = endnode;
    }

    public TekstNode next(Character choice) {
        TekstNode nextnode = null;
        for (Map.Entry<TekstNode, Character> entry : Tovergangen.entrySet()) {
            TekstNode node = entry.getKey();
            Character path = entry.getValue();
            // Als de input char niet gelijk is aan de char van het pad dan word nextnode null
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
