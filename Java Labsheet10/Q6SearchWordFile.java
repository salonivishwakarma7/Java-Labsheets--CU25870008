import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q6SearchWordFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("notes.txt");

            fw.write("Java is easy. Java is powerful.");
            fw.write(" I love Java programming.");

            fw.close();

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            BufferedReader br = new BufferedReader(
                    new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String w : words) {
                    w = w.replaceAll("[^a-zA-Z0-9]", "");

                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }

        } catch (IOException e) {
            System.out.println("File error.");
        }

        sc.close();
    }
}
