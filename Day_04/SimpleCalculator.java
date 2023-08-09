//Write a Program to Make a Simple Calculator Using switch...case
//https://www.codeswithpankaj.com/

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        char choice = sc.next().charAt(0);

        int result = 0;

        switch(choice){
             case '+' : result = num1 + num2;
            break;
             case '-' : result = num1 - num2;
            break;
             case '*' : result = num1 * num2;
            break;
             case '/' : result = num1 / num2;
            break;
            default : System.out.println("Select Only + , - , * , / ");
            break;              
        }

        System.out.println("Your Result is : = "+result);

       
    }
}
