package Sep_09_2023;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> data = new HashMap<>();
        data.put(101,"toy");
        data.put(101,"toy8");
        data.put(102,"toy1");
        data.put(103,"toy2");
        data.put(104,"toy3");
        System.out.println(data);

        // Retrieving values using keys
        System.out.println(data.get(102));
        // Retrieving values using getOrDefault

        System.out.println(data.get(106));
        // Getting the key set
        Set<Integer> keys = data.keySet();
        System.out.println("Keys in the HashMap: " + keys);
        // Getting the collection of values
        Collection<String> values =  data.values();
        System.out.println("all value .."+values);
        System.out.println(data.values());

        // Getting the entry set
        Set<Map.Entry<Integer, String>> entrySet = data.entrySet();

        // Iterating over the entry set
        for(Map.Entry<Integer, String> obj : entrySet) {
            Integer key = obj.getKey();
            String value = obj.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Iterating over the entry set
        for(Map.Entry<Integer, String> obj : entrySet) {
            System.out.println(obj.getValue());
        }



        }




    }

