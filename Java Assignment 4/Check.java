public class Check {
    public void checkPostive(int num){
        if(num<0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        else{
            System.out.println("Valid Number");
        }
    }
    public static void main(String[]args){
        Check c=new Check();
        c.checkPostive(-5);
        System.out.println("rest of the code");
    }
    
}
