public class Constants{
    final int employee=30;
    public void updateLimit(){
        employee=35;
    }
    public static void main(String[]args){
        Constants c=new Constants();
        c.updateLimit();
    }
}