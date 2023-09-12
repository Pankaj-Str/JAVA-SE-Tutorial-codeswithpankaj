// Java Program to Count the Number of Digits in an Integer:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        
        while (number != 0) {
            number /= 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
    }
}
