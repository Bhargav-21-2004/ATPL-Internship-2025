public class Display {
    
    void show(int a,int b){
        System.out.println("the integers are "+a +"and "+b);

    }
    void show(String a ,String b){
        System.out.println("The strings are:"+a +"and"+b);
    }
    void show(int a[]){
        for(int i=0;i<a.length;i++)
        System.out.println("the arrays are:"+a[i]);
    }
    public static void main(String[]args){
    Display d=new Display();
    d.show(2,3);
    d.show("bhargav","sai");
    d.show(new int[]{1,2,3});

    }
}
