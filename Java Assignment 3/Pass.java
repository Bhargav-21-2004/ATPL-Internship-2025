import java.util.*;
public class Pass {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        String encryptedPassword = encryptPassword(password);
        System.out.println("Original Password: " + password);
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
    public static String encryptPassword(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}


