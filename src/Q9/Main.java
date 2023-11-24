package Q9;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("file.txt");  // replace with your input file path
        File outputFile = new File("out.txt");  // replace with your output file path

        String oldWord = "vmhnl,";  // replace with the word you want to replace
        String newWord = "newWord";  // replace with the word you want to use

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(oldWord, newWord);
                writer.write(line);
                writer.newLine();  // write a newline character to separate lines
            }

            System.out.println("File modified successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

