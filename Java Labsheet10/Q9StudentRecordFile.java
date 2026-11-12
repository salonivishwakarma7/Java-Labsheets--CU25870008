import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q9StudentRecordFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {

                System.out.println("Enter details of Student " + i);

                System.out.print("Roll Number: ");
                String roll = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                String marks = sc.nextLine();

                fw.write("Roll Number: " + roll + "\n");
                fw.write("Name: " + name + "\n");
                fw.write("Course: " + course + "\n");
                fw.write("Marks: " + marks + "\n");
                fw.write("-------------------\n");
            }

            fw.close();

            System.out.println("\nAll records saved successfully.");

            BufferedReader br = new BufferedReader(
                    new FileReader("student_records.txt"));

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error.");
        }

        sc.close();
    }
}
