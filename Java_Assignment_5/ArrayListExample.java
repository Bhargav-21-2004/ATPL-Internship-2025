import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> arraylist=new ArrayList<String>();
        arraylist.add("raju");
        arraylist.add("ravi");
        arraylist.add("ram");
        arraylist.add("rakesh");
        arraylist.add("ramesh");
        System.out.println("Elementsin the list by using For Loop: ");
        for(int length=0;length<arraylist.size();length++){
            String names=arraylist.get(length);
            System.out.println(names);
        }
        System.out.println("Elements in the list by using Enchanced for loop:");
        for(String names:arraylist){
            System.out.println(names);
        }
        System.out.println("Elements after removing 3Rde element:");
        arraylist.remove(2);
        System.out.println(arraylist);


       
    }
}