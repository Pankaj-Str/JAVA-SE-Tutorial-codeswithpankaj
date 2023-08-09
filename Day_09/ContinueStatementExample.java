
// p4n.in
// codeswithpankaj.com

public class ContinueStatementExample {
    public static void main(String[] args) {
        // Iterate through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Skip printing even numbers
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
