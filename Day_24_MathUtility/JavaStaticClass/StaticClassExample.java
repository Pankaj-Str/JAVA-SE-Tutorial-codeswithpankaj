package Day_24_MathUtility.JavaStaticClass;

public class StaticClassExample {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = MathUtility.PI * MathUtility.square(radius);
        System.out.println("Area of a circle with radius " + radius + " is " + area);

        int number = 5;
        int factorial = MathUtility.factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

