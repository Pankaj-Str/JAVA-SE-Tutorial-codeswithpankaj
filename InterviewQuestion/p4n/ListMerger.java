package p4n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMerger{

    // Generic method to merge two lists by alternating elements
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1, 3, 5);
        List<Integer> integerList2 = Arrays.asList(2, 4, 6, 8, 10);

        List<String> stringList1 = Arrays.asList("a", "c", "e");
        List<String> stringList2 = Arrays.asList("b", "d", "f", "g");

        List<Integer> mergedIntegerList = mergeLists(integerList1, integerList2);
        List<String> mergedStringList = mergeLists(stringList1, stringList2);

        System.out.println("Merged Integer List: " + mergedIntegerList);
        System.out.println("Merged String List: " + mergedStringList);
    }
}
