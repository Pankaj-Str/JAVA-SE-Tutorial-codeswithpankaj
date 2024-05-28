package p4n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListFilter {

    // Generic method to filter elements based on a predicate
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringList = Arrays.asList("samosa", "kachori", "fafda", "jalebi", "vadapav");

       
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<String> containsE = str -> str.contains("e");

        
        List<Integer> evenNumbers = filterList(integerList, isEven);
        List<String> stringsWithE = filterList(stringList, containsE);

       
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Strings Containing 'e': " + stringsWithE);
    }
}
