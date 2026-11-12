import java.util.ArrayList;
import java.util.Scanner;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks);
    }
}

public class Q15StudentManagement {

    static void searchStudent(
            ArrayList<Student<Integer, String, Double>> list, int id) {

        boolean found = false;

        for (Student<Integer, String, Double> s : list) {
            if (s.id.equals(id)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {

        ArrayList<Student<Integer, String, Double>> list =
                new ArrayList<>();

        Student<Integer, String, Double> s1 =
                new Student<>(101, "Rahul", 85.5);

        Student<Integer, String, Double> s2 =
                new Student<>(102, "Priya", 90.5);

        Student<Integer, String, Double> s3 =
                new Student<>(103, "Amit", 78.5);

        Student<Integer, String, Double> s4 =
                new Student<>(104, "Neha", 88.5);

        Student<Integer, String, Double> s5 =
                new Student<>(105, "Riya", 95.5);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("All Students:");

        for (Student<Integer, String, Double> s : list) {
            s.display();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        searchStudent(list, id);

        System.out.println("Total Students: " + list.size());

        System.out.println("Student exists: " + list.contains(s1));

        sc.close();
    }
}
