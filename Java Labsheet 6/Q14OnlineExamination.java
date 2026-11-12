import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Q14OnlineExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Invalid marks!");
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric marks.");
        } catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
            sc.close();
        }
        sc.close();
    }
}
