import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentWriter2{
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
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File creation error.");
        }

        scanner.close();
    }
}



