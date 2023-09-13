
// Define a Shape interface
interface Shape {
    double area();
    double perimeter();
}

// Create an enum for different geometric shapes
 enum GeometricShape{
    CIRCLE(new Circle(5.0)),
    RECTANGLE(new Rectangle(4.0, 6.0)),
    TRIANGLE(new Triangle(3.0, 4.0, 5.0));

    private final Shape shape;

    private GeometricShape(Shape shape) {
        this.shape = shape;
    }

    public double area() {
        return shape.area();
    }

    public double perimeter() {
        return shape.perimeter();
    }
}

// Implement the Shape interface for each shape-specific class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        // Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class EnumClassExample{
    public static void main(String[] args) {
        GeometricShape circle = GeometricShape.CIRCLE;
        GeometricShape rectangle = GeometricShape.RECTANGLE;
        GeometricShape triangle = GeometricShape.TRIANGLE;

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
