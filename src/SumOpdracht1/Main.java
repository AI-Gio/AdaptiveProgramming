package SumOpdracht1;

public class Main {
    public static void main(String[] arg) {
        Klant k1 = new Klant("Nonne", "0612345678", "Gruttoweg 8", "Utrecht");
        Klant k2 = new Klant("Ruben", "0687654321", "Errorlaan 404", "Debug");
        Klant k3 = new Klant("Adam", "0615263748", "Skateweg 420", "Hoogsprong");
        Klant k4 = new Klant("Koen", "0684736251", "Gamepark 96", "Marion");

        Kapper ka1 = new Kapper("Guy");
        Kapper ka2 = new Kapper("Keetie");

        Behandeling b1 = new Behandeling(29.99, "Geknipt & Verzorgd", 45);
        Behandeling b2 = new Behandeling(49.99, "Gekleurd & Verzorgd", 90);
        Behandeling b3 = new Behandeling(39.99, "Highlights & Verzorgd", 60);

        Afspraak a1 = new Afspraak(k1, ka1, b1, "10:30", "April", 30, 2020);
        Afspraak a2 = new Afspraak(k2, ka2, b2, "11:00", "April", 30, 2020);
        Afspraak a3 = new Afspraak(k3, ka1, b1, "17:00", "Maart", 7, 2020);
        Afspraak a4 = new Afspraak(k4, ka2, b3, "15:00", "Juli", 2, 2020);

        Bon bo1 = new Bon(a1, b1);
        Bon bo2 = new Bon(a2, b2);
        Bon bo3 = new Bon(a3, b1);
        Bon bo4 = new Bon(a4, b3);

        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println(bo3);
        System.out.println(bo4);
    }
}
