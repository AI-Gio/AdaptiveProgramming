package SumOpdracht2;


import ForOpracht2b.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class KansNode {
    private HashMap<KansNode, Double> overgangen = new HashMap<>();
    private Random ran = new Random();
    private String naam;

    public KansNode(String naam) {
        this.naam = naam;
    }

    public KansNode next() {
        Double x = 0.0;
        ArrayList<KansNode> nodes = new ArrayList<>();
        for (Double i:overgangen.values()) {
            x += i;
        }
        if (x != 1.0) {
            return null;
        }
        else {
            for (KansNode j:overgangen.keySet()){
                for (int y = 0; y < overgangen.get(j); y++) {
                    nodes.add(j);
                }
            }
            return nodes.get(ran.nextInt(nodes.size()));
        }
    }
}
