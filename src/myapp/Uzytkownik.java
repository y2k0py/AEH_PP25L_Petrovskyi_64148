package myapp;

public class Uzytkownik {
    private final String imie;
    private Hulajnoga wypozyczona;

    public Uzytkownik(String imie) {
        this.imie = imie;
    }

    public void wypozycz(Stacja s) {
        Hulajnoga h = s.wypozyczDostepna();
        if (h != null) {
            wypozyczona = h;
            System.out.println(imie + " wypożyczył hulajnogę: " + h.getId());
        } else {
            System.out.println(imie + ": brak dostępnych hulajnóg.");
        }
    }

    public void zwroc(Stacja s, double zuzycie) {
        if (wypozyczona != null) {
            wypozyczona.zwroc(zuzycie);
            System.out.println(imie + " zwrócił hulajnogę: " + wypozyczona.getId());
            wypozyczona = null;
        }
    }
}
