package myapp;


public class mojaDziesiataAplikacja {
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int countNegative = 0;
        int sumPositive = 0;

        for (int number : input) {
            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                sumPositive += number;
            }
        }

        return new int[] {countNegative, sumPositive};
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println(java.util.Arrays.toString(result));
    }
}