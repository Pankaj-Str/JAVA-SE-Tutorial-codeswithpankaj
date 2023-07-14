// Program to reverse the digits of a number:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/ 

import java.util.Scanner;

public class ReverseDigits {
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
