package myapp;

public class TestWypozyczalni {
    public static void main(String[] args) {
        Osobowe auto = new Osobowe("PO12345", "1HGCM82633A123456", "Czerwony", 25000, 7, 20, 100000, 5);
        Motocykl motor = new Motocykl("PO54321", "2HGEJ6613WH123456", "Czarny", 8000, 4, 10, 5000, false);
        Ciezarowka tir = new Ciezarowka("WE11111", "1FTFW1ET1EFA12345", "Biały", 120000, 15, 50, 200000, 10000);
        SprzetBudowlany koparka = new SprzetBudowlany("KR22222", "3C6UR5FL6GG123456", "Żółty", 150000, 12, 60, 8000, 3500);

        auto.prowadz(100);
        motor.zatankuj(5);
        tir.prowadz(200);
        koparka.prowadz(50);
    }
}