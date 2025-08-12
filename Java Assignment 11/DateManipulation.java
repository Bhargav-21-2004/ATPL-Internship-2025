import java.time.*;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 7, 23);

        LocalDate plusTenDays = today.plusDays(10);
        LocalDate minusTwoMonths = today.minusMonths(2);

        System.out.println("Original Date: " + today);
        System.out.println("After adding 10 days: " + plusTenDays);
        System.out.println("After subtracting 2 months: " + minusTwoMonths);
    }
}
