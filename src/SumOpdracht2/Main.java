package SumOpdracht2;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] arg) {
        KansNode k1 = new KansNode("k1");
        KansNode k2 = new KansNode("k2");
        KansNode k3 = new KansNode("k3");
        KansNode k4 = new KansNode("k4");

        TekstNode t1 = new TekstNode("t1");
        TekstNode t2 = new TekstNode("t2");
        TekstNode t3 = new TekstNode("t3");
        TekstNode t4 = new TekstNode("t4");

        k1.addOvergangKans(k2, 1.0);
        k1.addOvergangKans(k3, 0.5);
        k1.addOvergangKans(k4, 0.1);

        t1.addovergangTekst(t2, 'A');
        t2.addovergangTekst(t3, 'B');
        t3.addovergangTekst(t4, 'C');

        FSM fsm = new FSM();
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');

//      Arraylist van tekstnodes is volgens mij niet eens nodig
        ArrayList<TekstNode> tekstNodes = new ArrayList<>();
//        tekstNodes.add(t1);
//        tekstNodes.add(t2);
//        tekstNodes.add(t3);
//        tekstNodes.add();

        fsm.TFSM(t1, tekstNodes);
        System.out.println(fsm.runTekst(characters));



    }
}
