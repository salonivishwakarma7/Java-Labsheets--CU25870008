import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Q12PatientAgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Invalid patient age.");
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Registration successful.");

        } catch (NumberFormatException e) {
            System.out.println("Age must be a number.");
        } catch (InvalidPatientAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Patient age validation completed.");
            sc.close();
        }
    }
}
