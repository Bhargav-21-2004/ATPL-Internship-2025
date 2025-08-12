public class BankAccount {
    long deposit;
    long withdraw;
    long balance;
    public void deposit(int money){
        balance+=money;
        System.out.println("Deposit Amount:"+money);
    }
    public void withDraw(int money){
        if(balance>0 && money<=balance){
            balance=balance-money;
            System.out.println("withdraw amount:"+money);
        }
        else{
            System.out.println("unsufficent funds");
        }

    }
    void checkBalance(){
        System.out.println("Current Balance:"+balance);
    }
    public static void main(String[]args){
        BankAccount account1= new BankAccount();
        BankAccount account2= new BankAccount();
        BankAccount account3= new BankAccount();
        account1.deposit(50000);
        account2.deposit(30000);
        account3.deposit(45000);
        account1.withDraw(20000);
        account2.withDraw(10000);
        account3.withDraw(25000);
        account1.checkBalance();
        account2.checkBalance();
        account3.checkBalance();

    }

    
}
