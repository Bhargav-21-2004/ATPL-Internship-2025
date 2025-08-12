abstract class Shape {
    public abstract double area();
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double area() {
        return side * side; 
    }
}
class Triangle extends Shape {
    private double base;   
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;  
    }
        public static void main(String[] args) {
        Shape square = new Square(4);  
        Shape triangle = new Triangle(6, 3); 
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}