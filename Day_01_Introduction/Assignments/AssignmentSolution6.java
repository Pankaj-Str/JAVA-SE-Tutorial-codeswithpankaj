package Day_01_Introduction.Assignments;
//Write a Program to Swap Two Numbers
//https://www.codeswithpankaj.com
//https://www.p4n.in

import java.util.Scanner;

public class AssignmentSolution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
