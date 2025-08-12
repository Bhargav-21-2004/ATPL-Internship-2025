public interface Greeting {
    void sayHello();
}
class Anonymous{
        public static void main(String[]args){
            Greeting g=new Greeting(){
                public void sayHello(){
                    System.out.println("Hello evreyone");
            };
        
    };
    g.sayHello();
    }
}
