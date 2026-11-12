import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q8CharacterCount {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("input.txt");

            fw.write("Java123 Programming");

            fw.close();

            FileReader fr = new FileReader("input.txt");

            int ch;
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            while ((ch = fr.read()) != -1) {

                char c = (char) ch;

                if (Character.isLetter(c)) {

                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }

                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            fr.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}