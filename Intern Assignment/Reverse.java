
public class Reverse{
    public static void main(String[]args){
        String input ="helloworld";
        char[]chars=input.toCharArray();
        System.out.println("reverse of string");
        for(int i=chars.length-1;i>=0;i--){
            System.out.println(chars[i]);
        }
    }
}   