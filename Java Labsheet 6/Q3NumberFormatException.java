public class Q3NumberFormatException {
    public static void main(String[] args) {

        String str = "123";

        try {
            int num = Integer.parseInt(str);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        String str2 = "Hello";

        try {
            int num = Integer.parseInt(str2);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
