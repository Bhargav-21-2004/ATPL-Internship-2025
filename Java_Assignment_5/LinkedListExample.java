
import java.util.*;
public class LinkedListExample {
    public static void main(String[]args){
        LinkedList<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        System.out.println("The Elements in the list:"+linkedlist);
        linkedlist.addFirst(5);
        linkedlist.addLast(60);
        linkedlist.remove(2);
        System.out.println("After adding and removing the elements:"+linkedlist);
    }
    
}
