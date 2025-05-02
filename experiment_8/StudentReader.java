package experiment_8;

import java.io.*;

public class StudentReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("student.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

