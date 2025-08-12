import java.time.*;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2004, 01, 21);
        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);

        System.out.println("Age is: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");
    }
}
