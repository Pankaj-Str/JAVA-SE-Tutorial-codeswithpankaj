package Day_21;

// Define an interface named 'Drawable'
interface Drawable {
    void draw(); // Abstract method
}

// Implement the 'Drawable' interface in a class 'Circle'
class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Implement the 'Drawable' interface in a class 'Rectangle'
class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(8, 6);

        // Polymorphic method invocation
        circle.draw();     // Calls draw() in Circle class
        rectangle.draw();  // Calls draw() in Rectangle class
    }
}

