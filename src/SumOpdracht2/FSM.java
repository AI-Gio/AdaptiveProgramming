package SumOpdracht2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FSM {
    private ArrayList<Character> path = new ArrayList<>();
    private KansNode KcurrentNode;
    private TekstNode TcurrentNode;
    private ArrayList<String> Koutput = new ArrayList<>();
    private ArrayList<String> Toutput = new ArrayList<>();

    public void KFSM(KansNode kcurrentNode) {
        KcurrentNode = kcurrentNode;
    }

    public void TFSM(TekstNode tcurrentNode) {
        TcurrentNode = tcurrentNode;
    }

    public ArrayList<String> runTekst(ArrayList<Character> path) {
        this.path = path;
        Toutput.add(TcurrentNode.getNaam());
        for (Character i : path) {
            if (TcurrentNode.getEndnode() == true) {
                break;
            } else if (TcurrentNode.next(i) != null){
                Toutput.add(TcurrentNode.next(i).getNaam());
                TcurrentNode = TcurrentNode.next(i);
            } else if (TcurrentNode.next(i) == null) {
                throw new Error("This path doesnt exist for this node");
            }

        }
        return Toutput;
    }

    public ArrayList<String> runKans() {
        Koutput.add(KcurrentNode.getNaam());
        while (KcurrentNode.next() != null && KcurrentNode.getEndnode() != true) {
            KcurrentNode = KcurrentNode.next();
            Koutput.add(KcurrentNode.getNaam());
        }
        return Koutput;
    }

}
