// Program to calculate the sum of the series 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n:
// https://www.codeswithpankaj.com
// https://www.p4n.in

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println("Sum of the series: " + sum);
    }
}
