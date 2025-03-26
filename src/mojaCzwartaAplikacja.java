import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (lowerLimit >= upperLimit) {
                scanner.close();
                break;
            }

            int sum = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                sum += i * i;
            }

            System.out.println("The sum of the squares from " + lowerLimit * lowerLimit + " to " + upperLimit * upperLimit + " is " + sum);


        }
    }





}