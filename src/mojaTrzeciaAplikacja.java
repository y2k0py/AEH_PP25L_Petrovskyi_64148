import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę dni (wpisz wartość niedodatnią, aby zakończyć): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " dni to " + weeks + " tygodnie i " + remainingDays + " dni.");
        }

        while (true) {
            System.out.print("Podaj temperaturę w Fahrenheitach (wpisz -1, aby zakończyć): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                break;
            }

            double celsius = (fahrenheit - 32) / 1.8;
            double kelvin = celsius + 273.16;

            System.out.printf("Fahrenheit: %.2f, Celsjusz: %.2f, Kelwin: %.2f\n", fahrenheit, celsius, kelvin);
        }

        scanner.close();
    }
}