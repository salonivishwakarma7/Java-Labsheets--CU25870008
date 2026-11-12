import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Q10UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks! Enter marks between 0 and 100.");
            }

            System.out.println("Valid marks: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
            
        }sc.close();
        }
    }
