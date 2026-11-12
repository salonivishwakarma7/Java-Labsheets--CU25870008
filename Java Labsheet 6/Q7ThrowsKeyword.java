import java.util.Scanner;

public class Q7ThrowsKeyword {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("Eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}