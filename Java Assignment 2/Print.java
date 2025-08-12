interface Printable {
    void print();
}
class Document implements Printable {
    public void print() {
        System.out.println("Printing the document");
    }
}
class Image implements Printable {
    public void print() {
        System.out.println("Printing the image");
    }
}
class Invoice implements Printable {
    public void print() {
        System.out.println("Printing the invoice");
    }
}
public class Print{
    public static void main(String[] args) {
        Printable doc = new Document();
        Printable img = new Image();
        Printable inv = new Invoice();
        doc.print();   
        img.print();   
        inv.print();  
    }
}
