import java.io.*;
public class Resources {
    public static void readFileSafely(String filename) {
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filename)))  {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        readFileSafely("Aaslin.txt");
    }
}