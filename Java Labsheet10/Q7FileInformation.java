import java.io.File;
import java.util.Scanner;

public class Q7FileInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        File file = new File(name);

        System.out.println("File Exists: " + file.exists());
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Is File: " + file.isFile());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());

        sc.close();
    }
}
