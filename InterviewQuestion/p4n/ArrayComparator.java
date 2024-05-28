package p4n;

// ArrayComparator
public class ArrayComparator {

    public static <T> boolean arraysEqual(T[] array1, T[] array2) {

        if (array1 == null && array2 == null) {
            return true;
        }

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};

        String[] strArray1 = {"Arjun", "Bhuvan", "Chetan"};
        String[] strArray2 = {"Arjun", "Bhuvan", "Chetan"};
        String[] strArray3 = {"Arjun", "Bhuvan", "Dev"};

        System.out.println("Comparing intArray1 and intArray2: " + arraysEqual(intArray1, intArray2)); // true
        System.out.println("Comparing intArray1 and intArray3: " + arraysEqual(intArray1, intArray3)); // false
        System.out.println("Comparing strArray1 and strArray2: " + arraysEqual(strArray1, strArray2)); // true
        System.out.println("Comparing strArray1 and strArray3: " + arraysEqual(strArray1, strArray3)); // false
    }
}
