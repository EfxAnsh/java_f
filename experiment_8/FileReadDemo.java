package experiment_8;
import java.io.*;
import java.util.Scanner;

public class FileReadDemo {
    public static void readFile(String fileName) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name to read: ");
        String fileName = input.nextLine();

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            System.out.println("File operation attempted.");
        }
    }
}
