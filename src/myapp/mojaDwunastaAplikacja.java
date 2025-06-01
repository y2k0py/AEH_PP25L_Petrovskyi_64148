package myapp;

import java.io.*;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFilePath;
        File inputFile;

        while (true) {
            System.out.print("Podaj pełną ścieżkę do pliku wejściowego: ");
            inputFilePath = scanner.nextLine();
            inputFile = new File(inputFilePath);
            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj pełną ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();

        int lineCount = 0;


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku: " + e.getMessage());
            return;
        }


        System.out.println("Liczba linii w pliku: " + lineCount);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("Nazwa pliku: " + inputFile.getName());
            writer.newLine();
            writer.write("Liczba linii: " + lineCount);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
