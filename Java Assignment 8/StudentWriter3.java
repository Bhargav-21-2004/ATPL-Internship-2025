import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Scanner;

public class StudentWriter3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintWriter writer = new PrintWriter("students.txt");

            String header = String.format("%-15s %-5s %-15s %-5s", "Name", "Age", "Department", "GPA");
            writer.println(header);
            System.out.println(header);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Department: ");
                String department = scanner.nextLine();

                System.out.print("GPA: ");
                double gpa = Double.parseDouble(scanner.nextLine());

                String formatted = String.format("%-15s %-5d %-15s %-5.2f", name, age, department, gpa);
                writer.println(formatted);
                System.out.println(formatted);

                String summary = MessageFormat.format("Student {0} from {1} department has secured a GPA of {2}.",
                        name, department, String.format("%.2f", gpa));
                System.out.println(summary);
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File creation error.");
        }

        scanner.close();
    }
}
