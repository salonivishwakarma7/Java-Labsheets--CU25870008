import java.util.ArrayList;

public class Q1StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Neha");
        students.add("Riya");
        students.add("Karan");
        students.add("Simran");
        students.add("Rohit");
        students.add("Anjali");
        students.add("Vikas");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}