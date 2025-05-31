package myapp;


public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn(1, 5000, "Jan Kowalski", "owner@example.com", "+48 987 654 321");

        magazyn.dodajTowar(3000);
        magazyn.usunTowar(1000);
        magazyn.dodajTowar(2500);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("owner@magazyn.pl", "+48 123 456 789");
        magazyn.dodajTowar(1000);
    }
}