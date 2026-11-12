import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Q15StudentCollectionManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward Traversal");
            System.out.println("7. Backward Traversal");
            System.out.println("8. Display Sorted IDs");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    if (uniqueIds.contains(id)) {
                        System.out.println("Student ID already exists.");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, marks);

                    students.add(s);
                    uniqueIds.add(id);
                    sortedIds.add(id);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    Iterator<Student> it = students.iterator();

                    while (it.hasNext()) {
                        Student st = it.next();

                        if (st.id == removeId) {
                            it.remove();
                            uniqueIds.remove(removeId);
                            sortedIds.remove(removeId);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    if (uniqueIds.contains(searchId)) {
                        for (Student st : students) {
                            if (st.id == searchId) {
                                System.out.println(st);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Student Records:");

                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " +
                            students.size());
                    break;

                case 6:
                    System.out.println("Forward Traversal:");

                    ListIterator<Student> forward =
                            students.listIterator();

                    while (forward.hasNext()) {
                        System.out.println(forward.next());
                    }
                    break;

                case 7:
                    System.out.println("Backward Traversal:");

                    ListIterator<Student> backward =
                            students.listIterator(students.size());

                    while (backward.hasPrevious()) {
                        System.out.println(backward.previous());
                    }
                    break;

                case 8:
                    System.out.println("Sorted Student IDs: " +
                            sortedIds);
                    break;

                case 9:
                    System.out.println("Exiting Program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}