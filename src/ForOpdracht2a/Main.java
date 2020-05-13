package ForOpdracht2a;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setNodeA(s2);
        s0.setNodeB(s1);
        s1.setNodeA(s1);
        s1.setNodeB(s2);
        s2.setNodeA(s2);
        s2.setNodeB(s3);
        s3.setNodeA(s3);
        s3.setNodeB(s0);

//      Hier maak je de lijst van nodes aan
        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(s0);
        nodes.add(s1);
        nodes.add(s2);
        nodes.add(s3);

//      Hier geef je de lijst met nodes mee in FSM class
        FSM fsm1 = new FSM(nodes);
        ArrayList<Character> a = new ArrayList<>();
        a.add('A');
        a.add('A');
//        System.out.println(s0.getNaam() + s0.getNodeA().getNaam());
//        System.out.println(fsm1.getOutput());
//
        System.out.println(fsm1.run(a));

// ik heb het idee dat de gesette attributen niet worden meegenomen in de run functie in FSM class, omdat ik de lijst met nodes
// wel terug krijg maar de gesette informatie zoals de naam en de node die bij overgang A hoort niet mee worden genomen.
// ik begrijp dus niet waarom die niet worden meegenomen


    }
}
