package Q7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt"); // replace with your file path
            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of words: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
