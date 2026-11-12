import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Q15PharmacyInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicine = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative.");
            }

            if (required > available) {
                throw new InsufficientMedicineStockException("Insufficient medicine stock.");
            }

            System.out.println("Medicine: " + medicine);
            System.out.println("Required quantity: " + required);
            System.out.println("Medicine issued successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric quantities.");
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
            sc.close();
        }
    }
}
