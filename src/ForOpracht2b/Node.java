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
        ArrayList<Node> nodes = new ArrayList<>();
        for (Double i:overgangen.values()) {
            x += i;
        }
        if (x != 1.0) {
            return null;
        }
        else {
            for (Node j:overgangen.keySet()){
                for (int y = 0; y < overgangen.get(j); y++) {
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
