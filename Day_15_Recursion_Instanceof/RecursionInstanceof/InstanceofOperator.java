package Day_16;
class Shape {
    // Shape class implementation
}

class Circle extends Shape {
    // Circle class implementation
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    // Rectangle class implementation
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    // Triangle class implementation
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class  InstanceofOperator{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Circle();

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape; // Casting shape to Circle
                circle.draw(); // Drawing a circle
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape; // Casting shape to Rectangle
                rectangle.draw(); // Drawing a rectangle
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape; // Casting shape to Triangle
                triangle.draw(); // Drawing a triangle
            } else {
                System.out.println("Unknown shape");
            }
        }
    }
}
