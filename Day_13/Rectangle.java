package Day_13;
// p4n.in
// codeswithpankaj.com

public class Rectangle {
    private int width;
    private int height;
    
    // Parameterized constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    // Getter methods
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    // Setter methods
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return width * height;
    }
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);   // Creating an object using the constructor
        System.out.println("Width: " + rectangle1.getWidth());        // Output: Width: 5
        System.out.println("Height: " + rectangle1.getHeight());      // Output: Height: 10
        System.out.println("Area: " + rectangle1.calculateArea());    // Output: Area: 50
        
        Rectangle rectangle2 = new Rectangle(8, 4);    // Creating another object
        System.out.println("Width: " + rectangle2.getWidth());        // Output: Width: 8
        System.out.println("Height: " + rectangle2.getHeight());      // Output: Height: 4
        System.out.println("Area: " + rectangle2.calculateArea());    // Output: Area: 32
    }
}
