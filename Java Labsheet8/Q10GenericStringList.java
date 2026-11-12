import java.util.ArrayList;

public class Q10GenericStringList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Neha");
        names.add("Riya");

        System.out.println("Original List: " + names);

        System.out.println("Element: " + names.get(1));

        names.set(1, "Karan");

        System.out.println("After set: " + names);

        names.remove("Neha");

        System.out.println("After remove: " + names);

        System.out.println("Size: " + names.size());
    }
}