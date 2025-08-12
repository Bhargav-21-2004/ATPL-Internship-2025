class Library {
    class Book{
        void read(){
            System.out.println("Students reads Books");
        }
    }
}
public class Library1{
    public static void main(String[]args){
        Library lb=new Library();
        Library.Book bk=lb.new Book();
        bk.read();
    }
}
