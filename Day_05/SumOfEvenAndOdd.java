// Program to read a set of integers and print the sum of even and odd integers:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a set of integers (0 to stop): ");
        
        int evenSum = 0;
        int oddSum = 0;
        int number;
        
        while ((number = scanner.nextInt()) != 0) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
