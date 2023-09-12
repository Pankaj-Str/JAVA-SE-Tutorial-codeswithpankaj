package OneDimensionalArrays;
import java.util.Scanner;
//p4n.in
//codeswithpankaj.com
public class SingleArrayUserInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array based on the user input
        int[] numbers = new int[size];

        // Get values for the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        // Close the Scanner
        scanner.close();
    }
}
