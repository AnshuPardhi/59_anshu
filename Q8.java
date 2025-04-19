import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "numbers.txt";

        // Write
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("100\n200\n300");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // Read
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println("Number: " + line);
            }
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
