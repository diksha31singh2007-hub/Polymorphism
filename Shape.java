//Parent class
class Shape {
    public double area() {
        return 0;
    }
}
//Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
//Rectangle class
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
//Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(9, 5);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}

