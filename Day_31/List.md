# Classes that Implement List

Since List is an interface, we cannot create objects from it.
In order to use functionalities of the List interface, we can use these classes:
    
1. ArrayList
2. LinkedList
3. Vector
4. Stack

# Implementing the ArrayList Class 

The Java Collections Framework provides a built-in `ArrayList` class, so you don't need to implement it from scratch. You can use the `ArrayList` class that comes with Java to store and manipulate lists of objects. Here's an example of how to use the Java `ArrayList` class:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Accessing elements by index
        int element = arrayList.get(1);
        System.out.println("Element at index 1: " + element); // Output: Element at index 1: 2

        // Removing an element by value
        arrayList.remove(Integer.valueOf(2));
        System.out.println("After removing value 2: " + arrayList); // Output: After removing value 2: [1, 3]

        // Checking the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size); // Output: Size of the ArrayList: 2
    }
}
```

In this example, we import the `ArrayList` class from the `java.util` package, create an instance of `ArrayList<Integer>`, and use various methods like `add`, `get`, and `remove` to manipulate the list. The Java Collections Framework provides a rich set of functionality for working with lists, including dynamic resizing, iteration, and sorting, among others.

# Implementing the LinkedList Class 

