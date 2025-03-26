import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        while (true) {
            try {
                System.out.print("Enter two numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers.");
                scanner.nextLine();
            }
        }

        char operation;
        while (true) {
            System.out.print("""
                    Enter operation symbol:\s
                    + for addition
                    - for subtraction
                    * for multiplication
                    / for division
                    """
            );
            operation = scanner.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                break;
            }
            System.out.println("Invalid operation symbol. Try again.");
        }

        switch (operation) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    System.out.println("Result: " + ((double) a / b));
                }
                break;
        }

        scanner.close();
    }
}
