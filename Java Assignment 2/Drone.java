interface Movable {
    public void move();
}
class Car implements Movable {
    public void move() {
        System.out.println("The car drives on the road.");
    }
}
class Robot implements Movable {
    public void move() {
        System.out.println("The robot walks using its legs.");
    }
}
class Drone implements Movable {
    public void move() {
        System.out.println("The drone flies in the air.");
    }
    public static void main(String[] args) {
        Movable car = new Car();
        Movable robot = new Robot();
        Movable drone = new Drone();

        car.move();     
        robot.move();   
        drone.move();   
    }
}

