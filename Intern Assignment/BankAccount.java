public class BankAccount {
    long deposit;
    long withdraw;
    double balance;
    public void deposit(int money){
        balance =balance+money;
        System.out.println("the deposit amount is:"+money);
    }
    public void withdraw(int money){
        if(balance>0 && money>=balance){
            balance =balance-money;
            System.out.println("the Withdraw amount is:"+money);
        }
        else{
            System.out.println("Insufficent funds in the bankAccount");
        }
    }
    public static void main(String[]args){
        BankAccount ba=new BankAccount();
        System.out.println("The remaining balance:"+balance);
        ba.deposit(50000);
        ba.withdraw(20000);
    }
}
