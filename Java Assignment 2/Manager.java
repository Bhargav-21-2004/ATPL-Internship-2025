public class Manager {
    String name;
    int id;
    String Department;
    Manager(String name,int id){
        this.name=name;
        this.id=id;
    }
    Manager(String name,int id,String Department){
        this(name,id);
        this.Department=Department;
    }
        
    public static void main(String[]args){
        Manager Mg=new Manager("Chandu",237242,"HR");
        System.out.println("The name of employee is "+Mg.name+"and the id of employee is "+Mg.id +"in Department "+Mg.Department);
        
    }
    
}
