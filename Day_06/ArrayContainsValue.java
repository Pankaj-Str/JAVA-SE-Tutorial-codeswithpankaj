
// Java Program to Check if An Array Contains a Given Value
// p4n.in
// codeswithpankaj.com

public class ArrayContainsValue {
    public static void main(String[] args) {
        // Define the array
        int[] array = {1, 2, 3, 4, 5};

        // Check if the array contains a given value
        int targetValue = 3;
        boolean containsValue = contains(array, targetValue);

        // Display the result
        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }

    public static boolean contains(int[] array, int targetValue) {
        for (int element : array) {
            if (element == targetValue) {
                return true;
            }
        }
        return false;
    }
}
