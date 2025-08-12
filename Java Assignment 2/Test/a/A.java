package Test.a;

public class A {
    protected String name="protected access modifier";
    String name2="default access modifier";
    public static void main(String[]args){
        A a=new A();
        System.out.println(a.name);
        System.out.println(a.name1);
    }


    
}
