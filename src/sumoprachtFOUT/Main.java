package sumoprachtFOUT;

public class Main {
    public static void main(String[] arg) {
        KansNode k1 = new KansNode("k1");
        KansNode k2 = new KansNode("k2");
        KansNode k3 = new KansNode("k3");

        k1.addOvergangKans(k2, 0.3);
        k1.addOvergangKans(k3, 0.7);

        }
    }

