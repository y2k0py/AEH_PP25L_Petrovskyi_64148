package myapp;

import java.util.ArrayList;
import java.util.List;

public class Stacja {
    private final String nazwa;
    private final List<Hulajnoga> hulajnogi = new ArrayList<>();

    public Stacja(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajHulajnoge(Hulajnoga h) {
        if (!hulajnogi.contains(h)) {
            hulajnogi.add(h);
        }
    }

    public Hulajnoga wypozyczDostepna() {
        for (Hulajnoga h : hulajnogi) {
            if (h.isDostepna() && h.getPoziomBaterii() > 10) {
                h.wypozycz();
                return h;
            }
        }
        return null;
    }

    public void wyswietlHulajnogi() {
        System.out.println("Stacja: " + nazwa);
        for (Hulajnoga h : hulajnogi) {
            System.out.println(h);
        }
    }
}
