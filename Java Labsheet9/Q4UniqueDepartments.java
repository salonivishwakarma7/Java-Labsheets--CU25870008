import java.util.HashSet;

public class Q4UniqueDepartments {
    public static void main(String[] args) {

        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("IT");
        departments.add("Mechanical");
        departments.add("Civil");
        departments.add("IT");
        departments.add("Computer Science");

        System.out.println("Departments: " + departments);
    }
}