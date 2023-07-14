// p4n.in
// codeswithpankaj.com
// example that demonstrates how to copy arrays using different methods in Java:
import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Method 1: Using a Loop
        int[] copyUsingLoop = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            copyUsingLoop[i] = sourceArray[i];
        }
        System.out.println("Copy using loop: " + Arrays.toString(copyUsingLoop));

        // Method 2: Using System.arraycopy()
        int[] copyUsingArrayCopy = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, copyUsingArrayCopy, 0, sourceArray.length);
        System.out.println("Copy using System.arraycopy(): " + Arrays.toString(copyUsingArrayCopy));

        // Method 3: Using Arrays.copyOf()
        int[] copyUsingCopyOf = Arrays.copyOf(sourceArray, sourceArray.length);
        System.out.println("Copy using Arrays.copyOf(): " + Arrays.toString(copyUsingCopyOf));

        // Method 4: Using Arrays.copyOfRange()
        int[] copyUsingCopyOfRange = Arrays.copyOfRange(sourceArray, 0, sourceArray.length);
        System.out.println("Copy using Arrays.copyOfRange(): " + Arrays.toString(copyUsingCopyOfRange));
    }
}
