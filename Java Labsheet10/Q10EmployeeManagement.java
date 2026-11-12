import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q10EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");

            FileWriter fw = new FileWriter(file, true);

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            fw.write(id + "," + name + "," + department + "," + salary + "\n");

            fw.close();

            System.out.println("Employee record saved successfully.");

            System.out.print("Enter Employee ID to search: ");
            String searchId = sc.nextLine();

            BufferedReader br = new BufferedReader(
                    new FileReader(file));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",", -1);

                if (data.length == 4 && data[0].equals(searchId)) {

                    System.out.println("Employee Record Found:");
                    System.out.println("Employee ID: " + data[0]);
                    System.out.println("Employee Name: " + data[1]);
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);

                    found = true;
                    break;
                }
            }

            br.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }

        } catch (IOException e) {
            System.out.println("File does not exist or cannot be accessed.");
        }

        sc.close();
    }
}
