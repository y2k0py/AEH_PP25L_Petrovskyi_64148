public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        // Task 1
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("2 * x = " + x * 2);
        System.out.println("x^2 = " + x * x);

        //Task 2
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your age: ");
        int ageInYears = scanner.nextInt();

        long ageInSeconds = (long) ageInYears * 365 * 24 * 60 * 60;

        System.out.println("Your age in seconds: " + ageInSeconds);

        scanner.close();


    }
}
