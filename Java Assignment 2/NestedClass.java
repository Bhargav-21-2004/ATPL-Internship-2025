class SystemUtils {
    static String log="logging";
    static class Logger{
        static void display(){
            System.out.println("Using inner class"+log);
        }
    }
}
public class NestedClass{
    public static void main(String[]args){
        SystemUtils sy=new SystemUtils();
        SystemUtils.Logger lg=new SystemUtils.Logger();
        SystemUtils.Logger.display();
    }
}
