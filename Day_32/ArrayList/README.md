# Java ArrayList


```scss
  +----------------+
  |   ArrayList   |
  +----------------+
        |
        |  Extends
        |
  +----------------+
  |   AbstractList |
  +----------------+
        |
        |  Implements
        |
  +----------------+
  |      List      |
  +----------------+
        |
        |  Methods
        |
  +----------------+
  | - add(E e)             |
  | - add(int index, E e)  |
  | - remove(int index)    |
  | - get(int index)       |
  | - set(int index, E e)  |
  | - indexOf(Object o)    |
  | - lastIndexOf(Object o)|
  | - size()               |
  | - isEmpty()            |
  | - contains(Object o)   |
  | - clear()              |
  | - iterator()           |
  | - subList(int fromIndex, |
  |            int toIndex)   |
  +------------------------+


```


## Creating an ArrayList

Before using `ArrayList`, we need to import the `java.util.ArrayList` package first. Here is how we can create arraylists in Java:
```java
ArrayList<Type> arrayList= new ArrayList<>();
Here, Type indicates the type of an arraylist. For example,

// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>();
```
In the above program, we have used Integer not int. It is because we cannot use primitive types while creating an arraylist. Instead, we have to use the corresponding wrapper classes.

## Example: Create ArrayList in Java

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements in the ArrayList
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Iterating over the ArrayList using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Checking if an element exists in the ArrayList
        boolean containsBob = names.contains("Bob");
        System.out.println("Does the list contain 'Bob'? " + containsBob);

        // Removing an element from the ArrayList
        names.remove("Charlie");

        // Checking the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing all elements from the ArrayList
        names.clear();

        // Checking if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);
    }
}

```


## The basic operations on an `ArrayList` in Java:

1. **Add Elements:**
   You can add elements to an `ArrayList` using the `add()` method.

   ```java
   import java.util.ArrayList;
   
   public class AddElementsExample {
       public static void main(String[] args) {
           ArrayList<String> colors = new ArrayList<>();
   
           // Adding elements to the ArrayList
           colors.add("Red");
           colors.add("Green");
           colors.add("Blue");
   
           // Displaying the ArrayList
           System.out.println("Colors: " + colors);
       }
   }
   ```

2. **Access Elements:**
   You can access elements in an `ArrayList` by their index using the `get()` method.

   ```java
   import java.util.ArrayList;
   
   public class AccessElementsExample {
       public static void main(String[] args) {
           ArrayList<String> fruits = new ArrayList<>();
           fruits.add("Apple");
           fruits.add("Banana");
           fruits.add("Cherry");
   
           // Accessing elements in the ArrayList
           String secondFruit = fruits.get(1);
           System.out.println("Second fruit: " + secondFruit);
       }
   }
   ```

3. **Change Elements:**
   You can change elements in an `ArrayList` by their index using the `set()` method.

   ```java
   import java.util.ArrayList;
   
   public class ChangeElementsExample {
       public static void main(String[] args) {
           ArrayList<Integer> numbers = new ArrayList<>();
           numbers.add(10);
           numbers.add(20);
           numbers.add(30);
   
           // Changing an element in the ArrayList
           numbers.set(1, 25); // Change the second element from 20 to 25
   
           // Displaying the updated ArrayList
           System.out.println("Updated numbers: " + numbers);
       }
   }
   ```

4. **Remove Elements:**
   You can remove elements from an `ArrayList` using the `remove()` method. Here, we'll demonstrate removing elements by both index and value.

   ```java
   import java.util.ArrayList;
   
   public class RemoveElementsExample {
       public static void main(String[] args) {
           ArrayList<String> colors = new ArrayList<>();
           colors.add("Red");
           colors.add("Green");
           colors.add("Blue");
   
           // Removing an element by index
           colors.remove(1); // Remove the element at index 1 (Green)
   
           // Removing an element by value
           boolean removed = colors.remove("Red"); // Remove the element "Red"
   
           // Displaying the updated ArrayList
           System.out.println("Updated colors: " + colors);
           System.out.println("Element 'Red' removed: " + removed);
       }
   }
   ```

## Methods of the `ArrayList` class in Java:

1. **size():**
   This method returns the number of elements in an `ArrayList`.

   ```java
   import java.util.ArrayList;

   public class SizeExample {
       public static void main(String[] args) {
           ArrayList<String> fruits = new ArrayList<>();
           fruits.add("Apple");
           fruits.add("Banana");
           fruits.add("Cherry");

           int size = fruits.size();
           System.out.println("Size of the ArrayList: " + size);
       }
   }
   ```

2. **sort():**
   The `sort()` method is used to sort the elements in the `ArrayList`.

   ```java
   import java.util.ArrayList;
   import java.util.Collections;

   public class SortExample {
       public static void main(String[] args) {
           ArrayList<Integer> numbers = new ArrayList<>();
           numbers.add(5);
           numbers.add(2);
           numbers.add(7);

           Collections.sort(numbers);

           System.out.println("Sorted numbers: " + numbers);
       }
   }
   ```

3. **clone():**
   The `clone()` method creates a new `ArrayList` with the same elements, size, and capacity as the original.

   ```java
   import java.util.ArrayList;

   public class CloneExample {
       public static void main(String[] args) {
           ArrayList<String> originalList = new ArrayList<>();
           originalList.add("One");
           originalList.add("Two");
           originalList.add("Three");

           ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

           System.out.println("Cloned ArrayList: " + clonedList);
       }
   }
   ```

4. **contains():**
   The `contains()` method checks if the `ArrayList` contains a specific element and returns a boolean result.

   ```java
   import java.util.ArrayList;

   public class ContainsExample {
       public static void main(String[] args) {
           ArrayList<String> colors = new ArrayList<>();
           colors.add("Red");
           colors.add("Green");
           colors.add("Blue");

           boolean containsGreen = colors.contains("Green");
           System.out.println("ArrayList contains 'Green': " + containsGreen);
       }
   }
   ```

5. **ensureCapacity():**
   The `ensureCapacity()` method is used to specify the total number of elements that the `ArrayList` can contain without resizing.

   ```java
   import java.util.ArrayList;

   public class EnsureCapacityExample {
       public static void main(String[] args) {
           ArrayList<String> fruits = new ArrayList<>();
           fruits.ensureCapacity(10); // Ensure the capacity is at least 10

           // You can add elements without resizing until the capacity reaches 10
           fruits.add("Apple");
           fruits.add("Banana");
           // ...
       }
   }
   ```

6. **isEmpty():**
   The `isEmpty()` method checks if the `ArrayList` is empty and returns a boolean result.

   ```java
   import java.util.ArrayList;

   public class IsEmptyExample {
       public static void main(String[] args) {
           ArrayList<String> animals = new ArrayList<>();

           boolean empty = animals.isEmpty();
           System.out.println("Is the ArrayList empty? " + empty);
       }
   }
   ```

7. **indexOf():**
   The `indexOf()` method searches for a specified element in the `ArrayList` and returns the index of the first occurrence of the element.

   ```java
   import java.util.ArrayList;

   public class IndexOfExample {
       public static void main(String[] args) {
           ArrayList<String> fruits = new ArrayList<>();
           fruits.add("Apple");
           fruits.add("Banana");
           fruits.add("Cherry");

           int indexOfBanana = fruits.indexOf("Banana");
           System.out.println("Index of 'Banana': " + indexOfBanana);
       }
   }
   ```


## What is the difference between Java ArrayList and LinkedList?

8. **Data Structure:**

   - **ArrayList:** Implements a dynamic array that can grow or shrink as needed. It stores elements in contiguous memory locations, making random access efficient. Elements are stored in a single block of memory.

   - **LinkedList:** Implements a doubly-linked list. It doesn't store elements in contiguous memory locations; instead, each element (node) contains a reference to the next and previous elements. This structure is efficient for insertions and deletions at the beginning or middle but not as efficient for random access.

9. **Performance Characteristics:**

   - **ArrayList:**
     - **Random Access:** Retrieving an element by index (e.g., `get()`) is efficient, typically O(1).
     - **Insertions and Deletions:** These operations in the middle of the list are less efficient, often O(n), because elements may need to be shifted.

   - **LinkedList:**
     - **Random Access:** Accessing elements by index is less efficient, typically O(n), as you need to traverse the list from the beginning or end to reach the desired index.
     - **Insertions and Deletions:** These operations are more efficient, often O(1), at the beginning or end of the list but still O(n) for insertions or deletions in the middle because you need to traverse to the desired location.

10. **Memory Usage:**

   - **ArrayList:** Tends to consume less memory than `LinkedList` because it doesn't require storing references to the next and previous elements.

   - **LinkedList:** Requires additional memory to store references to the next and previous elements, making it relatively more memory-intensive than `ArrayList`.

11. **Use Cases:**

   - **ArrayList:** Best suited for scenarios where you need frequent random access and the list size doesn't change frequently. Examples include list-backed data structures and scenarios where you need efficient retrieval of elements by their index.

   - **LinkedList:** More appropriate when frequent insertions and deletions are expected, especially at the beginning or middle of the list. Examples include implementing certain types of queues or performing frequent add/remove operations on data.

# How to convert an ArrayList to Array?

You can convert an `ArrayList` to an array in Java using the `toArray()` method. Here's how you can do it:

```java

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Convert ArrayList to an array of the same type
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Print the elements of the array
        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
```

In this example:

1. We create an `ArrayList` called `arrayList` and add some elements to it.

2. To convert the `ArrayList` to an array, we use the `toArray()` method on the `ArrayList`. We pass an array of the desired type as an argument to `toArray()`. In this case, we create a `String` array with the same size as the `ArrayList`.

3. The `toArray()` method returns an array containing the elements of the `ArrayList`, and we store it in the `array` variable.

4. Finally, we iterate through the `array` and print its elements.

## How to convert an array to ArrayList?

To convert an array to an `ArrayList` in Java, you can use the `Arrays.asList()` method to create a list view of the array, and then pass that list to the `ArrayList` constructor. Here's how you can do it:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};

        // Convert the array to an ArrayList
        List<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
```

In this example:

1. We start by creating an array called `fruitsArray` containing some elements.

2. To convert the array to an `ArrayList`, we use the `Arrays.asList(fruitsArray)` method. This method returns a `List` view of the array, which we then pass as an argument to the `ArrayList` constructor.

3. The `ArrayList` constructor creates a new `ArrayList` containing the elements from the list view.

4. Finally, we iterate through the `fruitsList` and print its elements.

# How to create and initialize an ArrayList in a single line?

You can create and initialize an `ArrayList` in a single line using Java's diamond operator and an initializer block. Here's how you can do it:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeArrayList {
    public static void main(String[] args) {
        // Create and initialize an ArrayList in a single line
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Print the elements of the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

In this example:

1. We create an `ArrayList` called `fruits` and use the constructor to initialize it with elements. Inside the constructor, we use `Arrays.asList()` to create a `List` of elements and pass it to the `ArrayList` constructor. The diamond operator (`<>`) is used to infer the generic type (`String` in this case) from the context.

2. The `fruits` `ArrayList` is initialized with the elements "Apple," "Banana," and "Cherry."

3. Finally, we iterate through the `fruits` and print its elements.

This allows you to create and populate an `ArrayList` in a single line, which can be convenient for shorter lists or when you know the elements in advance.


## How to convert an ArrayList to String?

To convert an `ArrayList` to a String in Java, you can iterate through the elements of the `ArrayList` and concatenate them into a single String, possibly separated by a delimiter. Here's how you can do it:

```java
import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Convert the ArrayList to a String with a delimiter
        String delimiter = ", "; // Define your desired delimiter
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruits) {
            sb.append(fruit).append(delimiter);
        }

        // Remove the trailing delimiter
        String fruitsString = sb.toString().replaceAll(delimiter + "$", "");

        // Print the resulting String
        System.out.println("Fruits: " + fruitsString);
    }
}
```

In this example:

1. We create an `ArrayList` called `fruits` and add some elements to it.

2. We define a `delimiter` variable (in this case, a comma followed by a space) to separate the elements in the resulting String.

3. We use a `StringBuilder` (`sb`) to efficiently concatenate the elements of the `ArrayList` into a single String, separated by the delimiter.

4. After the loop, we remove the trailing delimiter from the `StringBuilder` using `replaceAll()` to ensure that the final String does not have an extra delimiter at the end.

5. Finally, we print the resulting String, which contains the elements of the `ArrayList` separated by the chosen delimiter.

This approach allows you to convert the contents of an `ArrayList` to a single String with your desired format and delimiter.


## How to create an arraylist using the List interface?


You can create an `ArrayList` using the `List` interface by initializing it with an `ArrayList` instance. Here's how you can do it:

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithListInterface {
    public static void main(String[] args) {
        // Create an ArrayList using the List interface
        List<String> fruitsList = new ArrayList<>();

        // Add elements to the ArrayList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");

        // Print the elements of the ArrayList
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
```

In this example:

1. We create an `ArrayList` called `fruitsList` using the `List` interface. Note that you can use the `List` interface as the reference type, and the object being instantiated is still an `ArrayList`.

2. We add elements to the `fruitsList` using the `add()` method, just like we would with a regular `ArrayList`.

3. We iterate through the `fruitsList` and print its elements.

Using the `List` interface as the reference type allows you to write code that is more flexible, as you can switch between different list implementations (e.g., `ArrayList`, `LinkedList`, etc.) without changing the code that interacts with the list, as long as you use methods defined in the `List` interface.
