import java.util.*;

public class NamesStartingWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adhitya", "Bhargav", "Mahesh", "Shyam", "Gnaneswar", "Venkat");

        names.forEach(name -> {
            if (name.startsWith("B")) System.out.print(name + " ");
        });
    }
}
