import java.util.ArrayList;

public class Q2MarksList {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(85);
        marks.add(95);

        System.out.println("First Element: " + marks.get(0));
        System.out.println("Middle Element: " + marks.get(2));
        System.out.println("Last Element: " + marks.get(4));
    }
}
