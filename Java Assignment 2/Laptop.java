public class Laptop {
    String brand;
    String RAM;
    String processor;
    int price;
    public Laptop(String brand,String RAM,String processor){
        this.brand=brand;
        this.RAM=RAM;
        this.processor=processor;
    }
    public Laptop(String brand,String RAM,String processor,int price){
        this.brand=brand;
        this.RAM=RAM;
        this.processor=processor;
        this.price=price;
    }
    public static void main(String[]args){
        Laptop obj1 =new Laptop("HP","64gb","i5");
        Laptop obj=new Laptop("DELL","124gb","i7",60000);
        System.out.println("The "+obj1.brand+" has "+obj1.RAM+" with a"+ obj1.processor);
         System.out.println("The "+obj.brand+" has "+obj.RAM+" with a"+ obj.processor +" and the price of "+obj.price);
    }
}
