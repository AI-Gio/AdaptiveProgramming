package SumOpdracht2;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] arg) {

        TekstNode t1 = new TekstNode("t1",false);
        TekstNode t2 = new TekstNode("t2",false);
        TekstNode t3 = new TekstNode("t3",false);
        TekstNode t4 = new TekstNode("t4",false);
        TekstNode t5 = new TekstNode("t5",false);
        TekstNode t6 = new TekstNode("t6",true);
        TekstNode t7 = new TekstNode("t7",true);

        t1.addovergangTekst(t2, 'A');
        t1.addovergangTekst(t3, 'B');
        t2.addovergangTekst(t4, 'B');
        t2.addovergangTekst(t5, 'C');
        t3.addovergangTekst(t4, 'A');
        t3.addovergangTekst(t5, 'C');
        t4.addovergangTekst(t1, 'C');
        t4.addovergangTekst(t5, 'Z');
        t5.addovergangTekst(t2, 'C');
        t5.addovergangTekst(t6, 'X');
        t5.addovergangTekst(t7, 'Y');

        FSM fsm = new FSM();
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('A');
        characters.add('B');
        characters.add('Z');
        characters.add('C');
        characters.add('C');
        characters.add('Y');

        fsm.TFSM(t1);
        System.out.println(fsm.runTekst(characters));

        KansNode k1 = new KansNode("k1", false);
        KansNode k2 = new KansNode("k2", false);
        KansNode k3 = new KansNode("k3", false);
        KansNode k4 = new KansNode("k4", false);
        KansNode k5 = new KansNode("k5", true);
        KansNode k6 = new KansNode("k6", false);
        KansNode k7 = new KansNode("k7", true);
        KansNode k8 = new KansNode("k8", true);

        k1.addOvergangKans(k2, 0.5);
        k1.addOvergangKans(k3, 1.0);
        k2.addOvergangKans(k4, 1.0);
        k2.addOvergangKans(k5, 0.7);
        k3.addOvergangKans(k1, 1.0);
        k3.addOvergangKans(k6, 0.7);
        k3.addOvergangKans(k7, 0.9);
        k4.addOvergangKans(k8, 1.0);
        k4.addOvergangKans(k1, 0.9);
        k6.addOvergangKans(k5, 1.0);
        k6.addOvergangKans(k8, 0.1);

        fsm.KFSM(k1);
        System.out.println(fsm.runKans());

    }
}
