import java.time.*;

public class DayOfWeekExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 12, 25);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of the week: " + day);
    }
}
