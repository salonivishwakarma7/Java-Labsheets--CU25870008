import java.util.ArrayList;
import java.util.LinkedList;

public class Q14ListComparison {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("Java");
        a.add("Python");
        a.add("C++");

        System.out.println("ArrayList: " + a);

        a.add(1, "HTML");
        System.out.println("After Insertion: " + a);

        a.remove("Python");
        System.out.println("After Deletion: " + a);

        System.out.println("Get Element: " + a.get(1));
        System.out.println("Size: " + a.size());

        System.out.println("ArrayList Iteration:");
        for (String s : a) {
            System.out.println(s);
        }

        LinkedList<String> l = new LinkedList<>();

        l.add("Java");
        l.add("Python");
        l.add("C++");

        System.out.println("LinkedList: " + l);

        l.add(1, "HTML");
        System.out.println("After Insertion: " + l);

        l.remove("Python");
        System.out.println("After Deletion: " + l);

        System.out.println("Get Element: " + l.get(1));
        System.out.println("Size: " + l.size());

        System.out.println("LinkedList Iteration:");
        for (String s : l) {
            System.out.println(s);
        }
    }
}
