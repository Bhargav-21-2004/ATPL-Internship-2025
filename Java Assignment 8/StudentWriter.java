import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintWriter writer = new PrintWriter("students.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student " + i + ":");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Department: ");
                String department = scanner.nextLine();

                System.out.print("GPA: ");
                double gpa = Double.parseDouble(scanner.nextLine());

                writer.printf("Student[name=%s, age=%d, department=%s, gpa=%.2f]%n",
                        name, age, department, gpa);
            }

            writer.close();
            System.out.println("Student details written to students.txt successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to create the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
