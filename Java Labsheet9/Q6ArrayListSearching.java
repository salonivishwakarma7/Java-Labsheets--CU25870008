import java.util.ArrayList;
import java.util.Scanner;

public class Q6ArrayListSearching {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("MySQL");

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course found.");
        } else {
            System.out.println("Course not found.");
        }

        sc.close();
    }
}
