import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4AppendFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            String roll = sc.nextLine();

            System.out.print("Enter Marks: ");
            String marks = sc.nextLine();

            fw.write("\nStudent Name: " + name);
            fw.write("\nRoll Number: " + roll);
            fw.write("\nMarks: " + marks + "\n");

            fw.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("File error.");
        }

        sc.close();
    }
}
