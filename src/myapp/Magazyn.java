package myapp;


public class Magazyn {

    private int numerMagazynu;
    private int calkowitaPrzestrzen;
    private int zajetaPrzestrzen;
    private String nazwaWlasciciela;
    private String emailWlasciciela;
    private String telefonWlasciciela;

    public Magazyn(int numerMagazynu, int calkowitaPrzestrzen, String nazwaWlasciciela, String emailWlasciciela, String telefonWlasciciela) {
        this.numerMagazynu = numerMagazynu;
        this.calkowitaPrzestrzen = calkowitaPrzestrzen;
        this.zajetaPrzestrzen = 0;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.emailWlasciciela = emailWlasciciela;
        this.telefonWlasciciela = telefonWlasciciela;
    }

    public int getNumerMagazynu() { return numerMagazynu; }
    public int getCalkowitaPrzestrzen() { return calkowitaPrzestrzen; }
    public int getZajetaPrzestrzen() { return zajetaPrzestrzen; }
    public String getNazwaWlasciciela() { return nazwaWlasciciela; }
    public String getEmailWlasciciela() { return emailWlasciciela; }
    public String getTelefonWlasciciela() { return telefonWlasciciela; }

    public void setNumerMagazynu(int numerMagazynu) {
        this.numerMagazynu = numerMagazynu;
    }

    public void setCalkowitaPrzestrzen(int calkowitaPrzestrzen) {
        this.calkowitaPrzestrzen = calkowitaPrzestrzen;
        if (zajetaPrzestrzen > calkowitaPrzestrzen) {
            zajetaPrzestrzen = calkowitaPrzestrzen;
        }
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public void setEmailWlasciciela(String emailWlasciciela) {
        this.emailWlasciciela = emailWlasciciela;
    }

    public void setTelefonWlasciciela(String telefonWlasciciela) {
        this.telefonWlasciciela = telefonWlasciciela;
    }

    public void dodajTowar(int ilosc) {
        int wolne = calkowitaPrzestrzen - zajetaPrzestrzen;
        if (ilosc <= 0) {
            System.out.println("Ilość musi być dodatnia.");
            return;
        }
        if (ilosc > wolne) {
            System.out.printf("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: %d jednostek.%n", wolne);
            return;
        }
        zajetaPrzestrzen += ilosc;
        wolne -= ilosc;
        System.out.printf("Dodano %d jednostek towaru. Pozostała przestrzeń magazynowa: %d jednostek.%n", ilosc, wolne);
    }

    public void usunTowar(int ilosc) {
        if (ilosc <= 0) {
            System.out.println("Ilość musi być dodatnia.");
            return;
        }
        if (ilosc > zajetaPrzestrzen) {
            System.out.printf("Nie można usunąć %d jednostek. W magazynie jest tylko %d jednostek towaru.%n", ilosc, zajetaPrzestrzen);
            return;
        }
        zajetaPrzestrzen -= ilosc;
        int wolne = calkowitaPrzestrzen - zajetaPrzestrzen;
        System.out.printf("Usunięto %d jednostek towaru. Pozostała przestrzeń magazynowa: %d jednostek.%n", ilosc, wolne);
    }

    public void sprawdzZajetosc() {
        int wolne = calkowitaPrzestrzen - zajetaPrzestrzen;
        System.out.printf("Zajęta przestrzeń magazynowa: %d jednostek.%nDostępna przestrzeń magazynowa: %d jednostek.%n", zajetaPrzestrzen, wolne);
    }

    public void aktualizujKontakt(String nowyEmail, String nowyTelefon) {
        this.emailWlasciciela = nowyEmail;
        this.telefonWlasciciela = nowyTelefon;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.printf("Nowy email: %s%n", nowyEmail);
        System.out.printf("Nowy numer telefonu: %s%n", nowyTelefon);
    }
}
