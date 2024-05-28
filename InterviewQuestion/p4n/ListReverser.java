package p4n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ListReverser {

   
    public static <T> List<T> reverseList(List<T> list) {
        
        List<T> reversedList = new ArrayList<>(list);
        
      
        Collections.reverse(reversedList);

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> reversedIntegerList = reverseList(integerList);
        List<String> reversedStringList = reverseList(stringList);

        System.out.println("Original integerList: " + integerList);
        System.out.println("Reversed integerList: " + reversedIntegerList);

        System.out.println("Original stringList: " + stringList);
        System.out.println("Reversed stringList: " + reversedStringList);
    }
}
