class Student 
{
    String name;
    int id;
    static  String Schoolname ="AiM school";
    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name of the Student is "+name +" and id is "+id+"at "+Schoolname);
    }
}
    public class StudentClass{
    public static void main(String[]args){
        Student st1=new Student("bhargav",242);
        Student.Schoolname="lendi";
        st1.display();
        Student st2=new Student("siresh",237);
        st2.display();
    }


}
