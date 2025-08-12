import java.io.*;
public class FileLoader {
    public static void loadFile(String fileName) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file - " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing file stream.");
                }
            }
        }
    }

    public static void main(String[] args) {
        loadFile("Aaslin.txt");
    }
}
