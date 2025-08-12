import java.io.*;
import java.util.Scanner;
public class StudentSerialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());
            students[i] = new Student(id, name, age, department, gpa);   }    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println("All students serialized to students.ser successfully.");
        } catch (IOException e) {
            System.out.println("Serialization error:");
            e.printStackTrace();
        }
        scanner.close();
    }
}
class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String department;
    private double gpa;
    public Student(int id, String name, int age, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return String.format("Student[id=%d, name=%s, age=%d, department=%s, gpa=%.2f]",
                id, name, age, department, gpa);
    }
}


