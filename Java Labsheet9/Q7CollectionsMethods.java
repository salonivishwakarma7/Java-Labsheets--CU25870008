import java.util.ArrayList;
import java.util.Collections;

public class Q7CollectionsMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(50);

        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reverse List: " + list);

        System.out.println("Maximum: " + Collections.max(list));

        System.out.println("Minimum: " + Collections.min(list));

        System.out.println("Frequency of 10: " +
                Collections.frequency(list, 10));
    }
}
