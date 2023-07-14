
// https://www.codeswithpankaj.com/
// p4n.in
import java.time.LocalDate;

import java.util.Scanner;

public class AgeCalculator{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = LocalDate.now().getYear();

        // Calculate the age
        int age = currentYear - birthYear;

        // Display the result
        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();
    }
}

