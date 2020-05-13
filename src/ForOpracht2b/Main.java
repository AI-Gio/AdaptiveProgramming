package ForOpracht2b;

public class Main {
    public static void main(String[] arg) {
        Node s0 = new Node("s0", false);
        Node s1 = new Node("s1", false);
        Node s2 = new Node("s2", false);
        Node s3 = new Node("s3", true);
        Node s4 = new Node("s4",true);
        Node s5 = new Node("s5",true);
        Node s6 = new Node("s6",true);

        s0.addOvergangen(s1, 0.4);
        s0.addOvergangen(s2, 0.6);
        s1.addOvergangen(s3, 0.7);
        s1.addOvergangen(s4, 0.3);
        s2.addOvergangen(s5, 0.1);
        s2.addOvergangen(s6, 0.9);

        System.out.println(DTMC.run(s0));
    }
}
