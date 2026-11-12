import java.util.ArrayList;
import java.util.Scanner;

public class Q11SearchGenericList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        if (list.contains(num)) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number not found.");
        }

        sc.close();
    }
}
