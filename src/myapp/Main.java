package myapp;

public class Main {
    public static void main(String[] args) {
        Osoba     osoba     = new Osoba("Anna", "Nowak",     "81012727802");

        Pracownik pracownik = new Pracownik("Jan",  "Kowalski", "94091393701",
                "Programista", 8500.0);

        Menadzer  menadzer  = new Menadzer("Ewa",  "Wiśniewska","86071229504",
                "Kierownik działu", 12000.0, 10);

        System.out.println(osoba);
        System.out.println(pracownik);
        System.out.println(menadzer);

        System.out.println("Roczne wynagrodzenie pracownika: " +
                pracownik.obliczRoczneWynagrodzenie());
        System.out.println("Roczne wynagrodzenie menadżera: " +
                menadzer.obliczRoczneWynagrodzenie());
    }
}

