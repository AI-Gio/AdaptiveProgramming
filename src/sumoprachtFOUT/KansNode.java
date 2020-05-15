package sumoprachtFOUT;


import java.util.*;

public class KansNode {
    private String naam;
    private HashMap<KansNode, Double> Kovergangen = new HashMap<>();
    private HashMap<TekstNode, Double> Tovergangen = new HashMap<>();
    private Random ran = new Random();


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

//    public KansNode next() {
//        Double x = 0.0;
//        Double ran = Math.random();
//      Kijkt of alle values bij elkaar van de 2 hashmaps opgeteld 1 zijn
//        for (Double v : Kovergangen.values()) {x += v;}
//        for (Double va : Tovergangen.values()) {x += va;}
//        if (x != 1) {
//            return null;
//        } else {
//            sort(Kovergangen);
//            sort(Tovergangen);
//
//        }
//    }

    public void addOvergangKans (KansNode kansNode, Double prob){
        Kovergangen.put(kansNode, prob);
    }

    public void addovergangTekst (TekstNode tekstNode, Double proba){
        Tovergangen.put(tekstNode, proba);
    }

    public HashMap<KansNode, Double> getKovergangen() {
        return sort(Kovergangen);
    }
}
