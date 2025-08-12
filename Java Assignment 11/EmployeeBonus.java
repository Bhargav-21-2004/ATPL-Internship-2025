import java.util.*;
import java.util.function.*;

class Employee {
    String name;
    double salary;
    Optional<String> email;

    Employee(String name, double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = Optional.ofNullable(email);
    }
}
public class EmployeeBonus {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Bhargav", 75000, "bhargav123@gmail.com"),
            new Employee("Adhitya", 50000, null),
            new Employee("Shyam", 90000, "Shyam123@gmail.com")
        );

        Predicate<Employee> isEligible = e -> e.salary > 45000;

        employees.stream()
            .filter(isEligible)
            .forEach(e -> System.out.println(
                e.email.orElse("Email not available")
            ));
    }
}
