package myapp;

import java.util.*;

class Student {
    private String numerIndeksu;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String numerIndeksu, String imie, String nazwisko, List<Integer> oceny) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double obliczSrednia() {
        if (oceny == null || oceny.isEmpty()) return 0.0;
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return (double) suma / oceny.size();
    }
}

