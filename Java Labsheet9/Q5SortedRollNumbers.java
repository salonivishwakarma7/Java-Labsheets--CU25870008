import java.util.TreeSet;

public class Q5SortedRollNumbers {
    public static void main(String[] args) {

        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(105);
        rolls.add(102);
        rolls.add(110);
        rolls.add(101);
        rolls.add(108);
        rolls.add(104);
        rolls.add(107);
        rolls.add(103);
        rolls.add(109);
        rolls.add(106);

        System.out.println("Sorted Roll Numbers:");

        for (int num : rolls) {
            System.out.println(num);
        }
    }
}
