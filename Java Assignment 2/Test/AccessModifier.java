package Test;

public class AccessModifier {
    private String name1="private acces modifier";
    protected String name2="protected access modifier";
    public String name3 ="public access modifier";
    String name4="default access modifier";
    public static void main(String[]args){
        AccessModifier am= new AccessModifier();
        System.out.println("NAME 1 "+am.name1);
        System.out.println("NAmE 2 "+am.name2);
        System.out.println("NAME 3 "+am.name3);
        System.out.println("NAME 4 "+am.name4);
    }
    
}
