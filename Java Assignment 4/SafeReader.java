import java.io.*;

public class SafeReader {

    public static void readFileSafely(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFileSafely("sample.txt");
    }
}
