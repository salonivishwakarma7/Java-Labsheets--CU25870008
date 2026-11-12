import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3CountFileData {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("data.txt");

            fw.write("Java is easy.\n");
            fw.write("Java is powerful.\n");
            fw.write("I love programming.");

            fw.close();

            BufferedReader br = new BufferedReader(
                    new FileReader("data.txt"));

            String line;

            int lines = 0;
            int words = 0;
            int characters = 0;

            while ((line = br.readLine()) != null) {

                lines++;

                characters += line.length();

                String[] arr = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += arr.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}
