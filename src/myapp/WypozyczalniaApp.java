package myapp;

public class WypozyczalniaApp {
    public static void main(String[] args) {
        Stacja stacja = new Stacja("Centrum");

        stacja.dodajHulajnoge(new Hulajnoga("H1", 90));
        stacja.dodajHulajnoge(new Hulajnoga("H2", 30));
        stacja.dodajHulajnoge(new Hulajnoga("H3", 5)); // niedostępna (bateria < 10%)

        Uzytkownik jan = new Uzytkownik("Jan");
        Uzytkownik ala = new Uzytkownik("Ala");

        stacja.wyswietlHulajnogi();

        jan.wypozycz(stacja);
        ala.wypozycz(stacja);

        jan.zwroc(stacja, 25);

        stacja.wyswietlHulajnogi();
    }
}
