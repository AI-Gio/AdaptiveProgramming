package ForOpracht2b;

public class DTMC {
    public static String run(Node beginnode) {
        Node currentNode = beginnode;
        while (currentNode.next() != null && currentNode.getEindnode() == false) {
            if (currentNode.getEindnode() == true) {
                break;
            }
            else {
                currentNode = currentNode.next();
            }
        }
        if (currentNode.getEindnode() == true) {
            return currentNode.getNaam();
        }
        else {
            return "The probabilities dont add up to 1";
        }
    }
}