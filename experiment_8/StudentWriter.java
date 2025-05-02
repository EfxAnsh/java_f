package experiment_8;
import java.io.*;
import java.util.Scanner;

public class StudentWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String roll = scanner.nextLine();

        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        try (FileWriter fw = new FileWriter("student.txt", true)) {
            fw.write("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade + "\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        }
    }
}
