import java.util.Scanner;

public class Q4MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Division: " + (a / b));

            int arr[] = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
        sc.close();
    }
}
