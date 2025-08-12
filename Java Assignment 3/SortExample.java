import java.util.Arrays;
import java.util.Collections;
public class SortExample {
    public static void main(String[] args) {
        String[] names = {"Adhithya", "Shyam", "Mahesh", "bhargav", "Siddu"};
        Arrays.sort(names);
        System.out.println("Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("\nDescending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
