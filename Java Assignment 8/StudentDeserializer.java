import java.io.*;
import java.text.MessageFormat;

public class StudentDeserializer {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"))) {
            System.out.printf("%-5s %-15s %-5s %-15s %-5s%n", "ID", "Name", "Age", "Department", "GPA");

            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    String formatted = String.format("%-5d %-15s %-5d %-15s %-5.2f",
                            student.getId(),
                            student.getName(),
                            student.getAge(),
                            student.getDepartment(),
                            student.getGpa());
                    System.out.println(formatted);

                    String summary = MessageFormat.format(
                            "Student {0} from {1} department has secured a GPA of {2}.",
                            student.getName(),
                            student.getDepartment(),
                            String.format("%.2f", student.getGpa())
                    );
                    System.out.println(summary);

                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from students.ser");
            e.printStackTrace();
        }
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
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getGpa() { return gpa; }
}


