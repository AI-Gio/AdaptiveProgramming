import SumOpdracht2.FSM;
import SumOpdracht2.KansNode;
import SumOpdracht2.TekstNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FSMTest {
    private ArrayList<String> Toutput = new ArrayList<>();
    private ArrayList<String> Koutput = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();

    TekstNode t1 = new TekstNode("t1",false);
    TekstNode t2 = new TekstNode("t2",true);
    TekstNode t3 = new TekstNode("t3",false);

    KansNode k1 = new KansNode("k1", false);
    KansNode k2 = new KansNode("k2", true);
    KansNode k3 = new KansNode("k3", false);

    FSM fsm = new FSM();

    @Test
    public void TendnodeStop() {
        t1.addovergangTekst(t2,'A');
        t2.addovergangTekst(t3, 'B');
        Toutput.add("t1");
        Toutput.add("t2");
        characters.add('A');
        characters.add('B');
        fsm.TFSM(t1);

        assertEquals(Toutput, fsm.runTekst(characters));
    }

    @Test (expected = Error.class)
    public void TpathError() {
        t1.addovergangTekst(t2,'A');
        t2.addovergangTekst(t3, 'B');
        characters.add('C');
        fsm.TFSM(t1);
        fsm.runTekst(characters);
    }

    @Test
    public void KendnodeStop() {
        k1.addOvergangKans(k2, 1.0);
        k2.addOvergangKans(k3, 1.0);
        Koutput.add("k1");
        Koutput.add("k2");
        fsm.KFSM(k1);
        assertEquals(Koutput, fsm.runKans());
    }
}