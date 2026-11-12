import java.util.ArrayList;
import java.util.ListIterator;

public class Q13ListIteratorReport {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("MySQL");

        ListIterator<String> it = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Next Index: " + it.nextIndex());

        System.out.println("Backward Traversal:");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        System.out.println("Previous Index: " + it.previousIndex());
    }
}
