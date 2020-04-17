package test;

public class Student {
    private String Name;
    private int Age;
    private int[] Grades;
    private String Pet;

    public Student(String n, int a, int[] g, String p)
    {
        Name = n;
        Age = a;
        Grades = g;
        Pet = p;
    }

    public void Gem(int[] g){
        Grades = g;
    }



}
