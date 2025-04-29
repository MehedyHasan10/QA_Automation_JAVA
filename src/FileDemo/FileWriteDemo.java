package FileDemo;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) {

        String id, name;
        try {
            // Create a Formatter to write to the file
            Formatter formatter = new Formatter("C:/Users/Admin/Desktop/QA/unit_2/unit_8_java/Person/student.txt");
            Scanner input = new Scanner(System.in);

            System.out.print("How many students: ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Student ID and Name: ");
                id = input.next();
                name = input.next();

                // Correctly format and write to the file
                formatter.format("%s %s%n", id, name);
            }

            // Close the formatter
            formatter.close();
            System.out.println("Student data has been written to the file.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
