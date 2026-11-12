import java.util.ArrayList;
import java.util.ListIterator;

public class Q9ListIteratorModification {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String value = it.next();

            if (value.equals("Python")) {
                it.set("HTML");
                it.add("CSS");
            }
        }

        System.out.println("Updated List: " + list);
    }
}
