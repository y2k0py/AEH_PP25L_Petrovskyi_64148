package myapp;

interface TypPaliwa {
    String getTypPaliwa();
}

abstract class Pojazd {
    String nrRejestracyjny;
    String numerVin;
    String kolor;
    double cena;
    double spalanie;
    double poziomPaliwa;
    double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz(double km) {
        if (poziomPaliwa <= 0) {
            System.out.println("Brak paliwa!");
            return;
        }
        double zuzycie = (spalanie / 100.0) * km;
        if (zuzycie > poziomPaliwa) {
            System.out.println("Za mało paliwa na przejazd " + km + " km.");
        } else {
            poziomPaliwa -= zuzycie;
            przebieg += km;
            System.out.println("Pojazd przejechał " + km + " km. Pozostało paliwa: " + poziomPaliwa);
        }
    }

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + "L. Nowy poziom: " + poziomPaliwa);
    }
}

class Diesel implements TypPaliwa {
    public String getTypPaliwa() {
        return "Diesel";
    }
}

class Benzyna implements TypPaliwa {
    public String getTypPaliwa() {
        return "Benzyna";
    }
}

class Elektryk implements TypPaliwa {
    public String getTypPaliwa() {
        return "Elektryczny";
    }
}

class Osobowe extends Pojazd {
    int liczbaDrzwi;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                   double poziomPaliwa, double przebieg, int liczbaDrzwi) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
    }
}

class Ciezarowka extends Pojazd {
    double ladownosc;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                      double poziomPaliwa, double przebieg, double ladownosc) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
    }
}

class Motocykl extends Pojazd {
    boolean posiadaDostawke;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                    double poziomPaliwa, double przebieg, boolean posiadaDostawke) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
    }
}

class SprzetBudowlany extends Pojazd {
    int przepracowaneGodziny;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie,
                           double poziomPaliwa, double przebieg, int przepracowaneGodziny) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
    }
}