package Main;

import test.Student;
import test.Zwembad;

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
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        Auto a1 = new Auto("Peugeot 207 ", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: " + "\n" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

        System.out.println("Tweede autohuur: " + "\n" + ah2.toString());
        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}
