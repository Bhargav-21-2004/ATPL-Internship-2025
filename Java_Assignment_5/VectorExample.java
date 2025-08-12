import java.util.*;
public class VectorExample{
    public static void main(String[]args){
        Vector<Double> vector=new Vector<Double>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int length=0;length<4;length++){
            vector.add(sc.nextDouble());
        }
        System.out.println("The elemnts in Vector:"+vector);
        Enumeration<Double> e =vector.elements();
        while(e.hasMoreElements()){
            System.out.println("the Elemnets in enumeratrion:"+e.nextElement());
        }

        
    }

}