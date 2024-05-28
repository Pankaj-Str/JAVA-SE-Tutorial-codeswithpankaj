package p4n;

import java.util.List;
import java.util.Arrays;

public class ListSearcher {

     public static <T> int indexOfElement(List<T> list, T target) {
        if (list == null || target == null) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        int intIndex = indexOfElement(integerList, 5);
        int strIndex = indexOfElement(stringList, "cherry");
        int notFoundIndex = indexOfElement(stringList, "fig");

        System.out.println("Index of 5 in integerList: " + intIndex); // Should print 4
        System.out.println("Index of 'cherry' in stringList: " + strIndex); // Should print 2
        System.out.println("Index of 'fig' in stringList: " + notFoundIndex); // Should print -1
    }
}

