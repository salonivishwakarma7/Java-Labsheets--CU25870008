import java.util.ArrayList;
import java.util.HashSet;

public class Q10ListVsSet {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}
