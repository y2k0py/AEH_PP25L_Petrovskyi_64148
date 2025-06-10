package myapp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class mojaTrzynastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path inputPath;
        while (true) {
            System.out.print("Podaj pełną ścieżkę do pliku wejściowego: ");
            String inputFilePath = scanner.nextLine();
            inputPath = Paths.get(inputFilePath);
            if (Files.exists(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();
        Path outputPath = Paths.get(outputFilePath);

        Map<String, Integer> wordCounts = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9ąćęłńóśźżĄĆĘŁŃÓŚŹŻ]+", " ").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku: " + e.getMessage());
            return;
        }

        System.out.println("Liczba słów: " + totalWords);
        System.out.println("Wystąpienia poszczególnych słów:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            writer.write("Plik: " + inputPath.getFileName());
            writer.newLine();
            writer.write("Liczba wszystkich słów: " + totalWords);
            writer.newLine();
            writer.write("Wystąpienia poszczególnych słów:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
