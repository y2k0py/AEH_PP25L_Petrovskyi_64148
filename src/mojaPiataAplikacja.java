public class mojaPiataAplikacja {
    public static void printCharPattern(char symbol, int timesInRow, int rows) {
        if (timesInRow < 0 || rows < 0) {
            throw new IllegalArgumentException("Liczby nie mogą być ujemne");
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < timesInRow; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char symbol = '*';
        int timesInRow = 100;
        int rows = 20;

        System.out.println("Wzorzec dla symbolu '" + symbol + "', " + timesInRow + " razy w wierszu, " + rows + " wiersze:");
        printCharPattern(symbol, timesInRow, rows);
    }
}