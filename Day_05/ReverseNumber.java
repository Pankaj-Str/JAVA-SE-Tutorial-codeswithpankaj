// Java Program to Reverse a Number:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversedNumber);
    }
}
