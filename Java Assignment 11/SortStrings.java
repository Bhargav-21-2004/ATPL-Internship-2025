import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Cherry"));
        Collections.sort(fruits, (a, b) -> a.compareTo(b));
        System.out.println("Alphabetical order: " + fruits);
        Collections.sort(fruits, (a, b) -> b.compareTo(a));
        System.out.println("Reverse order: " + fruits);
    }
}
