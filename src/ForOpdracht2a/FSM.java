package ForOpdracht2a;

import java.util.ArrayList;

public class FSM {
    private ArrayList<Node> nodes;
    private ArrayList<Character> characters;
    private ArrayList<String> output;
    private Node currentNode;

    public FSM(ArrayList<Node> n) {
        nodes = n;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public ArrayList<String> getOutput() {
        return output;
    }

    public ArrayList<String> run(ArrayList<Character> ab) {
        characters = ab;
        // currentNode is de eerste waarde uit de lijst met nodes in nodes
        currentNode = nodes.get(0);
        // voeg de naam van de huidige node
        output.add(nodes.get(0).getNaam());

        for (Character i : characters) {
             if (i == 'A') {
                 output.add(currentNode.getNaam());
                 currentNode = currentNode.getNodeA();
             }
             else if (i == 'B') {
                 output.add(currentNode.getNaam());
                 currentNode = currentNode.getNodeB();
             }
        }
        return output;
    }


}
