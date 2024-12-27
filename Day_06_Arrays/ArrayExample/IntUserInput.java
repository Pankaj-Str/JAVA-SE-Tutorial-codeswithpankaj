import java.util.Scanner;

public class IntUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a size of array 

        int size;

        System.out.println("Enter Array size .... ");
        size = scanner.nextInt();

        int [] array = new int[size];


        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Array elements .... ["+i+"] = ");
            array[i] = scanner.nextInt();
        }


        // print all element of array
        System.out.println("Array elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.println("Array elements are : "+"["+i+"]  = "+array[i]);
        }

    }


}
