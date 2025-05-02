package experiment_8;

import java.io.*;
import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int wordCount = 0;
        int charCount = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                for (String word : words) {
                    charCount += word.length();
                }
            }

            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding whitespace): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
