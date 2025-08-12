import java.util.Scanner;
class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class LoginDemo {
    public static void login(String username, String password) throws LoginFailedException {
        String Username = "Bhargav";
        String Password = "123456";

        if (!username.equals(Username) || !password.equals(Password)) {
            throw new LoginFailedException("Invalid login details");
        }

        System.out.println("Login successful!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        try {
            login(user, pass); 
        } catch (LoginFailedException e) {
            System.out.println("Login failed: " + e.getMessage());
        }

        scanner.close();
    }
}
