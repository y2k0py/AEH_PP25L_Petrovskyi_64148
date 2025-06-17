package myapp;

public class TestWypozyczalniaHulajnog {
    public static void main(String[] args) {
        Stacja stacja = new Stacja("Dworzec Główny");

        Hulajnoga h1 = new Hulajnoga("H001", 80);
        Hulajnoga h2 = new Hulajnoga("H002", 50);
        Hulajnoga h3 = new Hulajnoga("H003", 5);

        stacja.dodajHulajnoge(h1);
        stacja.dodajHulajnoge(h2);
        stacja.dodajHulajnoge(h3);

        System.out.println("\nHulajnogi dostępne w stacji");
        stacja.wyswietlHulajnogi();

        Uzytkownik adam = new Uzytkownik("Adam");
        Uzytkownik ewa = new Uzytkownik("Ewa");

        System.out.println("\nWypożyczenia");
        adam.wypozycz(stacja);
        ewa.wypozycz(stacja);

        Uzytkownik jan = new Uzytkownik("Jan");
        jan.wypozycz(stacja);

        System.out.println("\nZwrot hulajnogi przez Adama");
        adam.zwroc(stacja, 30);

        System.out.println("\nHulajnogi po zwrotach");
        stacja.wyswietlHulajnogi();
    }
}
