class Vehicle 
{
    void Start(){
        System.out.println("Vehicle is Starting.");
    }
}
    class Bike extends Vehicle
    {
        void Start(){
            System.out.println("Bike is starting");
        }
    }
    class Car extends Vehicle
    {
        void Start(){
            System.out.println("Car is starting");
        }
public static void main(String[]args)
    {
        Car c =new Car();
        c.Start();
    }
}


