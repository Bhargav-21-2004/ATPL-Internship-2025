import java.util.Scanner;

public class LoginSystem {

    public static void login(String username, String password) throws LoginFailedException {
        if (!username.equals("admin") || !password.equals("password123")) {
            throw new LoginFailedException("Invalid login details.");
        } else {
            System.out.println("Login successful!");
        }
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
