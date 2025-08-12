import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankATM {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount);
    }
    public double getBalance() {
        return balance;
    }
}
public class ATMTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankATM atm = new BankATM();
        boolean running = true;
        while (running) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        atm.withdraw(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Transaction failed: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: ₹" + atm.getBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}

