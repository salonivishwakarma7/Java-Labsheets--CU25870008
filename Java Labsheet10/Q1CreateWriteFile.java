import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q1CreateWriteFile {
    public static void main(String[] args) {

        try {
            File file = new File("student.txt");

            file.createNewFile();

            FileWriter fw = new FileWriter(file);

            fw.write("Student Name: Rahul\n");
            fw.write("Roll Number: 101\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 2\n");

            fw.close();

            System.out.println("File created and data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}