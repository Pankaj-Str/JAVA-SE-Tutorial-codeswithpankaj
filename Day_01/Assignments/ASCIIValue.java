package Assignments;
//Write a Program to Find ASCII Value of a character
//www.codeswithpankaj.com
import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int asciiValue = (int) character;
        System.out.println("The ASCII value of the character is: " + asciiValue);
    }
}
