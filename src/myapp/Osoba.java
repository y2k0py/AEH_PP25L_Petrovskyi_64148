package myapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;

    public Osoba(String imie, String nazwisko, String pesel) {
        if (!czyPoprawnyPesel(pesel)) {
            throw new IllegalArgumentException("Niepoprawny PESEL");
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie()      { return imie;      }
    public String getNazwisko()  { return nazwisko;  }
    public String getPesel()     { return pesel;     }

    public void setImie(String imie)               { this.imie = imie; }
    public void setNazwisko(String nazwisko)       { this.nazwisko = nazwisko; }
    public void setPesel(String pesel) {
        if (!czyPoprawnyPesel(pesel)) {
            throw new IllegalArgumentException("Niepoprawny PESEL");
        }
        this.pesel = pesel;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzeniaZPeselu(pesel);
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Imię i nazwisko: " + imie + " " + nazwisko +
                "; data urodzenia: " + getDataUrodzenia().format(fmt);
    }


    private static LocalDate dataUrodzeniaZPeselu(String pesel) {
        int year  = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day   = Integer.parseInt(pesel.substring(4, 6));

        int century;
        if (month >= 80 && month <= 92) { century = 1800; month -= 80; }
        else if (month >= 60 && month <= 72) { century = 2200; month -= 60; }
        else if (month >= 40 && month <= 52) { century = 2100; month -= 40; }
        else if (month >= 20 && month <= 32) { century = 2000; month -= 20; }
        else { century = 1900; }

        year += century;

        try {
            return LocalDate.of(year, month, day);
        } catch (DateTimeException ex) {
            throw new IllegalArgumentException("PESEL zawiera nierealną datę");
        }
    }

    private static boolean czyPoprawnyPesel(String pesel) {
        if (!pesel.matches("\\d{11}")) return false;

        int[] wagi = {1,3,7,9,1,3,7,9,1,3};
        int suma = 0;

        for (int i = 0; i < wagi.length; i++) {
            suma += Character.getNumericValue(pesel.charAt(i)) * wagi[i];
        }
        int reszta = suma % 10;
        int kontrolna = (reszta == 0) ? 0 : 10 - reszta;

        return kontrolna == Character.getNumericValue(pesel.charAt(10));
    }
}

