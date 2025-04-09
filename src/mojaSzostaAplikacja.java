public class mojaSzostaAplikacja {
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba nie może być ujemna");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba nie może być ujemna");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 20;

        long startTimeIterative = System.nanoTime();
        long resultIterative = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        long startTimeRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Silnia " + n + " (metoda iteracyjna): " + resultIterative);
        System.out.println("Czas wykonania (iteracyjna): " + durationIterative + " ns");
        System.out.println("Silnia " + n + " (metoda rekurencyjna): " + resultRecursive);
        System.out.println("Czas wykonania (rekurencyjna): " + durationRecursive + " ns");
    }
}