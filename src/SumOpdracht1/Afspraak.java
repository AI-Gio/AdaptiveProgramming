package SumOpdracht1;

public class Afspraak implements tostring {
    private Klant klant;
    private Kapper kapper;
    private Behandeling behandeling;
    private String time;
    private String month;
    private int day;
    private int year;

    public Afspraak(Klant klant, Kapper kapper, Behandeling behandeling, String time, String month, int day, int year) {
        this.klant = klant;
        this.kapper = kapper;
        this.behandeling = behandeling;
        this.time = time;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Klant: " + klant.toString() + "\n" + "Kapper: " + kapper.getNaam() + "\n" + behandeling.toString() + "\n" +
                "Datum: " + time + ", " + day + " " + month + " " + year + "\n";
    }
}
