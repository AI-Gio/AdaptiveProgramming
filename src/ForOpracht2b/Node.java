package ForOpracht2b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Node {
    private String naam;
    private Boolean eindnode;
    private HashMap<Node, Double> overgangen;
    private Random ran = new Random();

    public Node(String naam, Boolean eindnode) {
        this.naam = naam;
        this.eindnode = eindnode;
        overgangen = new HashMap<>();
    }


    public void addOvergangen(Node node, Double prob) {
        overgangen.put(node, prob);
    }

    public Node next() {
        Double x = 0.0;
//      Hier komen de nodes in te staan voor random pick met kans
        ArrayList<Node> nodes = new ArrayList<>();
//      Kijkt of de overgangen van de node naar andere nodes bij elkaar optellen tot 1
        for (Double i:overgangen.values()) {
            x += i;
        }
//      Tellen ze niet op tot 1 return null
        if (x != 1.0) {
            return null;
        }
        else {
//          Loop door de overgangen keys(andere nodes)
            for (Node j:overgangen.keySet()){
//              Loop door de range van de waarde van de weg naar de ander node. bv: kans=0.5 -> nodes.add(j) * 5
                for (int y = 0; y < (overgangen.get(j) * 10); y++) {
                    nodes.add(j);
                }
            }
            return nodes.get(ran.nextInt(nodes.size()));
        }
    }


    public Boolean getEindnode() {
        return eindnode;
    }

    public String getNaam() {
        return naam;
    }
}
