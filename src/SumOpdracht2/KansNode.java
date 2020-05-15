package SumOpdracht2;

import java.util.*;

public class KansNode {
    private String naam;
    private boolean endnode;
    private HashMap<KansNode, Double> Kovergangen = new HashMap<>();

    public KansNode(String naam) {
        this.naam = naam;
    }

    //Dit sorteerd een hashmap bij values, bron:https://beginnersbook.com/2013/12/how-to-sort-hashmap-in-java-by-keys-and-values/
    public HashMap sort(HashMap overgangen) {
        List list = new LinkedList(overgangen.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    public KansNode next() {
        Double kleiner = 0.0;
        Double ran = Math.random();
        KansNode nextnode = null;
        Kovergangen = sort(Kovergangen);
        boolean foundkleiner = false;

        for (int x = 0; x < Kovergangen.size(); x++) {
            // Pak de values uit Kovergangen
            Double overgangvalue = Kovergangen.get(Kovergangen.keySet().toArray()[x]);
            // Kijkt of de value kleiner is
            if (overgangvalue > ran && foundkleiner == false) {
                kleiner = overgangvalue;
                foundkleiner = true;
            }
            // haalt de node op bij de bijbehorende value
            for (Map.Entry y: Kovergangen.entrySet()) {
                if (kleiner.equals(y.getValue())){
                    nextnode = (KansNode) y.getKey();
                    break;
                 }
            }
        }
        return nextnode;
    }

    public void addOvergangKans (KansNode kansNode, Double prob){
        Kovergangen.put(kansNode, prob);
    }

    public String getNaam() {
        return naam;
    }

    public boolean getEndnode() {
        return endnode;
    }
}
