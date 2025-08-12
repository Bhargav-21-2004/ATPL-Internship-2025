class Teacher{
    void teaches(){
        System.out.println("Teacher teaches Lessons");
    }
}
class Student extends Teacher{
    void teaches(){
        System.out.println("Student teaches to others fellows");
    }
    void learn(){
        System.out.println("Student learn from teacher");
    }
    void Do(){
        super.teaches();
        learn();
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.Do();
    }
}