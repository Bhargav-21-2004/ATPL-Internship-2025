public class ExceptionCheck {
    public static void main(String[]args){
         try{
            int div=100/0;
            String str=null;
            int[] a=new int[5];
            System.out.println(a[10]);
        }
    catch(ArithmeticException e){
        System.out.println("Arthimetic exceptions Ocuured");
        }
        catch(NullPointerException n){
            System.out.println("null point exception occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayindexoutofbond occured");
        }
        finally{
            System.out.println("all exceptions are excetued");
        }
    }
    
}
