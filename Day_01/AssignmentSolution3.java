//Write a Program in java to Multiply two Floating Point Numbers

import java.util.Scanner;

public class MultiplyFloatingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter the second floating-point number: ");
        float number2 = input.nextFloat();

        float product = number1 * number2;
        System.out.println("The product of the two floating-point numbers is: " + product);
    }
}
