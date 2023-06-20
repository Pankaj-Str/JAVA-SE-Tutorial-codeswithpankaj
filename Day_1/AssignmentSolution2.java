//Write a Program in java to Add Two Integers
import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum of the two integers is: " + sum);
    }
}
