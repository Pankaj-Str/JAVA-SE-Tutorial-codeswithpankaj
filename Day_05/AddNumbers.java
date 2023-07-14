// Program with a do-while loop that adds two numbers and asks the user whether to repeat:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            
            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}
