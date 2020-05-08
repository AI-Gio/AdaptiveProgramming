package ForOpdracht2a;

public class Node {
    private Node nodeA;
    private Node nodeB;
    private String naam;

    public Node(String naam) {
        this.naam = naam;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public String getNaam() {
        return naam;
    }
}
