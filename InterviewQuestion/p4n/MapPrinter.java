package p4n;

import java.util.Map;
import java.util.HashMap;

public class MapPrinter {

    
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
     
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "One");
        integerStringMap.put(2, "Two");
        integerStringMap.put(3, "Three");

        
        Map<String, Double> stringDoubleMap = new HashMap<>();
        stringDoubleMap.put("A", 1.1);
        stringDoubleMap.put("B", 2.2);
        stringDoubleMap.put("C", 3.3);

        
        System.out.println("Integer to String Map:");
        printMap(integerStringMap);

        System.out.println("\nString to Double Map:");
        printMap(stringDoubleMap);
    }
}
