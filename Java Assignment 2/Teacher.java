class Person {
    void eat(){
        System.out.println("person eats");
    } 
}
class Student extends Person{
    void learn(){
        System.out.println("student learns");
    }
}
class Teacher extends Person{
    void teachs(){
        System.out.println("teacher teachs");
    }
public static void main(String[]args){
    Teacher t=new Teacher();
    t.teachs();
}
}
