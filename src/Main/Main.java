package Main;

import Practise.Student;
import Practise.Zwembad;

import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {
        //Formatieve Opdracht: Opstart in OO

        //test.Zwembad
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);

        System.out.println(z1.getBreedte());
        System.out.println(z1.getLengte());
        System.out.println(z1.getDiepte());
        System.out.println(z1.Inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad(2.0, 5.5, 1.5);
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);

        System.out.println(z2.toString());
        System.out.println(z2.Inhoud());

        //Docenten en Studenten
        Student s1 = new Student("Jaap", 17, new int[]{10, 10, 10, 9},"Max");
        Student s2 = new Student("Annemarie", 20, new int[]{5,6,6,7}, "Joep");
        Student s3 = new Student("Youssef", 32 , new int[]{3, 7, 10, 8}, "Yarrak");

        //Formatieve Opdracht 1a
        //Autoverhuur
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Auto a1 = new Auto("Peugeot 207 ", 50.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500.0);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

        System.out.println("Tweede autohuur: " + "\n" + ah2.toString());
        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());

        //Gameswinkel
        Integer releaseJaar1 = LocalDate.now().getYear() - 1;
        Integer releaseJaar2 = LocalDate.now().getYear() - 2;

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200.0);
        Persoon p2 = new Persoon("Hans", 55.0);
        Persoon p3 = new Persoon("Arno", 185.0);

        System.out.println(p1.koop(g1));
        System.out.println(p1.koop(g2));
        System.out.println(p1.koop(g3));
        System.out.println(p2.koop(g2));
        System.out.println(p2.koop(g1));
        System.out.println(p3.koop(g3));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.verkoop(g1, p3));
        System.out.println(p2.verkoop(g2, p3));
        System.out.println(p2.verkoop(g1, p1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
