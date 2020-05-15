package ForOpracht2b;

public class DTMC {
    public static String run(Node beginnode) {
        Node currentNode = beginnode;
//      blijf loopen terwijl next niet null is en het geen eindnode is
        while (currentNode.next() != null && currentNode.getEindnode() == false) {
//          currentNode wordt de volgende node
            currentNode = currentNode.next();
        }
        if (currentNode.getEindnode() == true) {
            return currentNode.getNaam();
        } else {
            return "The probabilities dont add up to 1";
        }
    }
}