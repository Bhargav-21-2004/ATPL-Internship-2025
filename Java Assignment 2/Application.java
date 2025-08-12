abstract class Appliance {
    public abstract void turnOn();
    public abstract void turnOff();
}
class Fan extends Appliance {
    public void turnOn() {
        System.out.println("Fan is now ON.");
    }
    public void turnOff() {
        System.out.println("Fan is now OFF.");
    }
}
class TV extends Appliance {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}
public class Application {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        fan.turnOff();
        tv.turnOn();
        tv.turnOff();
    }
}