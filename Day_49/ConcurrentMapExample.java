import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap with String keys and Integer values
        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // put(K key, V value)
        concurrentMap.put("One", 1);

        // putIfAbsent(K key, V value)
        concurrentMap.putIfAbsent("Two", 2);
        concurrentMap.putIfAbsent("One", 3); // This won't change the value for "One"

        // replace(K key, V oldValue, V newValue)
        concurrentMap.replace("Two", 2, 4); // Replace the value for "Two" if it's 2

        // replace(K key, V value)
        concurrentMap.replace("One", 10); // Replace the value for "One"

        // remove(Object key)
        concurrentMap.remove("Two");

        // remove(Object key, Object value)
        concurrentMap.remove("One", 5); // Remove "One" only if it's currently mapped to 5

        // compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        concurrentMap.compute("One", (k, v) -> v + 10); // Add 10 to the value for "One"

        // computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
        concurrentMap.computeIfAbsent("Three", k -> 30); // Add "Three" with a value of 30 if it's absent

        // computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        concurrentMap.computeIfPresent("Three", (k, v) -> v + 5); // Update the value for "Three"

        // merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
        concurrentMap.merge("Three", 50, (v1, v2) -> v1 + v2); // Merge values for "Three"

        // containsKey(Object key)
        boolean containsKey = concurrentMap.containsKey("One");
        System.out.println("Contains key 'One'? " + containsKey);

        // containsValue(Object value)
        boolean containsValue = concurrentMap.containsValue(25); // Check if any value is 25
        System.out.println("Contains value 25? " + containsValue);

        // get(Object key)
        Integer value = concurrentMap.get("One");
        System.out.println("Value for 'One': " + value);

        // size()
        int size = concurrentMap.size();
        System.out.println("Size of the map: " + size);

        // isEmpty()
        boolean isEmpty = concurrentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // clear()
        concurrentMap.clear();
        System.out.println("Map cleared. Is it empty now? " + concurrentMap.isEmpty());
    }
}
