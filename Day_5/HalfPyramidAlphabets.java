// Program to print a half pyramid using alphabets:
// https://www.codeswithpankaj.com/
// https://www.p4n.in/

import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int alphabet = 65;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
