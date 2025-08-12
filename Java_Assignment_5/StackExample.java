import java.util.*;
public class StackExample {
    public static void main(String[]args){
        Stack<Integer>stack=new Stack<Integer>();
        System.out.println("Enter the elements:");    
        Scanner sc =new Scanner(System.in);
        for(int length=0;length<5;length++){
            stack.push(sc.nextInt());
        }
        System.out.println("The Elements in the StackList:"+stack);
        stack.pop();
        stack.pop();
        System.out.println("The elements After Poping:"+stack);


    }
    
}
