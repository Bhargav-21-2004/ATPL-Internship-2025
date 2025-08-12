public class Employee {
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("The employee is "+name+" and the id is "+id);

    }
    public static void main(String[] args) {
        Employee emp=new Employee("Bhargav",19);
        emp.display();
    }


    
}
