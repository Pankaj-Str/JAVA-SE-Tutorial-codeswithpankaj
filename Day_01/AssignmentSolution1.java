// Write a Program in java to Print an Integer (Entered by the User)
import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("The entered integer is: " + number);
    }
}
