// p4n.in
// codeswithpankaj.com
public class BreakStatementExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 6;

        // Iterate through the array to find the search value
        for (int number : numbers) {
            if (number == searchValue) {
                System.out.println("Value found!");
                break;
            }
        }
    }
}
