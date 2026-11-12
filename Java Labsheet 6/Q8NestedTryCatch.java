import java.util.Scanner;

public class Q8NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Division: " + result);

            try {
                int arr[] = {10, 20, 30, 40, 50};

                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                System.out.println("Element: " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        sc.close();
    }
}