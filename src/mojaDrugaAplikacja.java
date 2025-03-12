import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstname = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();

        scanner.close();

        System.out.println("Welcome " + firstname + " " + surname);

    }
}
