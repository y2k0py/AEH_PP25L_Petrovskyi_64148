package myapp;

public class Menadzer extends Pracownik {
    private int    liczbaPodwladnych;
    private double dodatekDoPensji;

    public Menadzer(String imie, String nazwisko, String pesel,
                    String stanowisko, double pensja,
                    int liczbaPodwladnych) {
        super(imie, nazwisko, pesel, stanowisko, pensja);
        this.liczbaPodwladnych = liczbaPodwladnych;

        this.dodatekDoPensji = pensja * 0.20;
    }

    public int getLiczbaPodwladnych() { return liczbaPodwladnych; }
    public double getDodatekDoPensji() { return dodatekDoPensji;  }

    public void setLiczbaPodwladnych(int liczba) { this.liczbaPodwladnych = liczba; }
    public void setDodatekDoPensji(double dodatek) { this.dodatekDoPensji = dodatek; }

    @Override
    public double obliczRoczneWynagrodzenie() {
        return (getPensja() + dodatekDoPensji) * 12.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; liczba podwładnych: " + liczbaPodwladnych +
                "; dodatek do pensji: " + dodatekDoPensji;
    }
}

