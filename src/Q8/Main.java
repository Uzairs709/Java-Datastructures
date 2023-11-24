package Q8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("file.txt");  // replace with your input file path
        File outputFile = new File("output.txt");  // replace with your output file path

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  // write a newline character to separate lines
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
