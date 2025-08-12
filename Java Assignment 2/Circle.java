public class Circle {
    private double radius;
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. It must be non-negative.");
        }
    }
    public double getRadius() {
        return radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(7);           
        circle.displayDetails();
    }
}
