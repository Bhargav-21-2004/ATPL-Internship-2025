import java.util.*;
import java.util.function.*;

class Customer {
    String name;
    boolean subscribed;

    Customer(String name, boolean subscribed) {
        this.name = name;
        this.subscribed = subscribed;
    }
}
public class CustomerNotification {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer("Bhargav", true),
            new Customer("Adhitya", false),
            new Customer("Shyam", true)
        );
        Consumer<Customer> notify = c -> System.out.println("Notifying " + c.name);

        customers.stream()
            .filter(c -> c.subscribed)
            .forEach(notify);
    }
}
