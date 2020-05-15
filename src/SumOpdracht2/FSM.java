package SumOpdracht2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FSM {
    private ArrayList<Character> path = new ArrayList<>();
    private KansNode KcurrentNode;
    private TekstNode TcurrentNode;
    private ArrayList<KansNode> Knodes = new ArrayList<>();
    private ArrayList<TekstNode> Tnodes = new ArrayList<>();
    private ArrayList<String> Koutput = new ArrayList<>();
    private ArrayList<String> Toutput = new ArrayList<>();

    public void KFSM(KansNode kcurrentNode, ArrayList<KansNode> knodes) {
        KcurrentNode = kcurrentNode;
        Knodes = knodes;
    }

    public void TFSM(TekstNode tcurrentNode, ArrayList<TekstNode> tnodes) {
        TcurrentNode = tcurrentNode;
        Tnodes = tnodes;
    }

    public ArrayList<String> runTekst(ArrayList<Character> path) {
        this.path = path;
        Toutput.add(TcurrentNode.getNaam());
        for (Character i : path) {
            if (TcurrentNode.next(i) == null && TcurrentNode.getEndnode()) {
                Toutput.add(TcurrentNode.getNaam());
            } else if (TcurrentNode.next(i) != null){
                Toutput.add(TcurrentNode.next(i).getNaam());
                TcurrentNode = TcurrentNode.next(i);
            } else if (TcurrentNode.next(i) == null) {
                throw new Error("This path doesnt exist for this node");
            }

        }
        return Toutput;
    }

//    public ArrayList<String> runKans() {
//        Koutput.add(KcurrentNode.getNaam());
//        while ()
//    }

}
