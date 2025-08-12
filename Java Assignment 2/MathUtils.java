class MathUtils {
    static int calculate(int a,int b){
        return a+b;
    }
    static double calculate(double a,double b){
        return a*b;
    }
    public static void main(String[]args){
        System.out.println(MathUtils.calculate(25,25));
        System.out.println(MathUtils.calculate(2.0,5.0));
    }  
}  
