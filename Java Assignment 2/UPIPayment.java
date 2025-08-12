class Payment {
    public void processPayment() {
        System.out.println("Processing generic payment");
    }
}
class CreditCardPayment extends Payment {
    public void processPayment() {
        System.out.println("Processing payment via Credit Card.");
    }
}
class UPIPayment extends Payment {
    public void processPayment() {
        System.out.println("Processing payment via UPI.");
    }
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment();  
        Payment payment2 = new UPIPayment();
        payment2.processPayment();
        Payment payment3 = new Payment();
        payment3.processPayment();  
    }
}
          