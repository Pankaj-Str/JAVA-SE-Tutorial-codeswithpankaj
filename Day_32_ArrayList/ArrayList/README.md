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



### 1. `boolean add(E e)`

```java
import java.util.ArrayList;

public class AddExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        System.out.println("After adding elements: " + languages);
    }
}
```

### 2. `void add(int index, E element)`

```java
import java.util.ArrayList;

public class AddAtIndexExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add(1, "JavaScript"); // Insert at index 1
        System.out.println("After adding element at index 1: " + languages);
    }
}
```

### 3. `boolean addAll(Collection<? extends E> c)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python"));
        List<String> newLanguages = Arrays.asList("JavaScript", "C++", "Go");
        languages.addAll(newLanguages);
        System.out.println("After adding all elements from another collection: " + languages);
    }
}
```

### 4. `boolean addAll(int index, Collection<? extends E> c)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllAtIndexExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python"));
        List<String> newLanguages = Arrays.asList("JavaScript", "C++", "Go");
        languages.addAll(1, newLanguages); // Insert at index 1
        System.out.println("After adding all elements at index 1: " + languages);
    }
}
```

### 5. `void clear()`

```java
import java.util.ArrayList;

public class ClearExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.clear();
        System.out.println("After clearing the list: " + languages);
    }
}
```

### 6. `Object clone()`

```java
import java.util.ArrayList;

public class CloneExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        ArrayList<String> clonedList = (ArrayList<String>) languages.clone();
        System.out.println("Original List: " + languages);
        System.out.println("Cloned List: " + clonedList);
    }
}
```

### 7. `boolean contains(Object o)`

```java
import java.util.ArrayList;

public class ContainsExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        boolean hasPython = languages.contains("Python");
        System.out.println("Contains Python: " + hasPython);
    }
}
```

### 8. `void ensureCapacity(int minCapacity)`

```java
import java.util.ArrayList;

public class EnsureCapacityExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.ensureCapacity(10); // Ensure capacity for at least 10 elements
        System.out.println("Capacity ensured for 10 elements.");
    }
}
```

### 9. `void forEach(Consumer<? super E> action)`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.forEach(language -> System.out.println("Language: " + language));
    }
}
```

### 10. `E get(int index)`

```java
import java.util.ArrayList;

public class GetExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        String secondLanguage = languages.get(1);
        System.out.println("Element at index 1: " + secondLanguage);
    }
}
```

### 11. `int indexOf(Object o)`

```java
import java.util.ArrayList;

public class IndexOfExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        int index = languages.indexOf("Python");
        System.out.println("Index of Python: " + index);
    }
}
```

### 12. `boolean isEmpty()`

```java
import java.util.ArrayList;

public class IsEmptyExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        boolean empty = languages.isEmpty();
        System.out.println("Is list empty: " + empty);
    }
}
```

### 13. `Iterator<E> iterator()`

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            System.out.println("Language: " + iterator.next());
        }
    }
}
```

### 14. `int lastIndexOf(Object o)`

```java
import java.util.ArrayList;

public class LastIndexOfExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript", "Python"));
        int lastIndex = languages.lastIndexOf("Python");
        System.out.println("Last index of Python: " + lastIndex);
    }
}
```

### 15. `ListIterator<E> listIterator()`

```java
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        ListIterator<String> listIterator = languages.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Language: " + listIterator.next());
        }
    }
}
```

### 16. `E remove(int index)`

```java
import java.util.ArrayList;

public class RemoveAtIndexExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.remove(1); // Removes element at index 1
        System.out.println("After removing element at index 1: " + languages);
    }
}
```

### 17. `boolean remove(Object o)`

```java
import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.remove("Python"); // Removes the first occurrence of "Python"
        System.out.println("After removing 'Python': " + languages);
    }
}
```

### 18. `boolean removeAll(Collection<?> c)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        List<String> removeList = Arrays.asList("Python", "JavaScript");
        languages.removeAll(removeList);
        System.out.println("After removing all elements in the specified collection: " + languages);
    }
}
```

### 19. `boolean removeIf(Predicate<? super E> filter)`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.removeIf(lang -> lang.startsWith("J")); // Removes all languages starting with 'J'
        System.out.println("After removing elements starting with 'J': " + languages);
    }
}
```

### 20. `void replaceAll(UnaryOperator<E> operator)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ReplaceAllExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.replaceAll(s -> s.toUpperCase()); // Converts all elements to uppercase
        System.out.println("After replacing all elements to uppercase: " + languages);
    }
}
```

### 21. `boolean retainAll(Collection<?> c)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllExample {
    public static void main(String[]

 args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        List<String> retainList = Arrays.asList("Java", "JavaScript");
        languages.retainAll(retainList); // Retains only elements in retainList
        System.out.println("After retaining elements in the specified collection: " + languages);
    }
}
```

### 22. `E set(int index, E element)`

```java
import java.util.ArrayList;

public class SetExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.set(1, "Kotlin"); // Replaces element at index 1 with "Kotlin"
        System.out.println("After setting element at index 1 to 'Kotlin': " + languages);
    }
}
```

### 23. `int size()`

```java
import java.util.ArrayList;

public class SizeExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        int size = languages.size();
        System.out.println("Size of the list: " + size);
    }
}
```

### 24. `void sort(Comparator<? super E> c)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.sort(Comparator.naturalOrder()); // Sorts in natural order
        System.out.println("Sorted list: " + languages);
    }
}
```

### 25. `Spliterator<E> spliterator()`

```java
import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        Spliterator<String> spliterator = languages.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
```

### 26. `List<E> subList(int fromIndex, int toIndex)`

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript", "C++", "Go"));
        List<String> subList = languages.subList(1, 3); // Get sublist from index 1 to 2 (exclusive)
        System.out.println("Sublist from index 1 to 3: " + subList);
    }
}
```

### 27. `Object[] toArray()`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        Object[] array = languages.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
}
```

### 28. `<T> T[] toArray(T[] a)`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayWithTypeExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        String[] array = new String[languages.size()];
        array = languages.toArray(array);
        System.out.println("Array with type: " + Arrays.toString(array));
    }
}
```

### 29. `void trimToSize()`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class TrimToSizeExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        languages.trimToSize(); // Trims the capacity to the current size of the list
        System.out.println("Capacity trimmed to size.");
    }
}
```

## The `ArrayList` class in Java inherits the `equals` and `hashCode` methods from the `java.util.AbstractList` class. Here’s how you can use these methods in examples:

### `equals(Object o)`

The `equals` method is used to compare the current list with another object to check if they are equal. Two lists are considered equal if they have the same size and contain the same elements in the same order.

#### Example:

```java
import java.util.ArrayList;

public class EqualsExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("JavaScript");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("JavaScript");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Python");

        // Comparing list1 with list2
        boolean isEqual1 = list1.equals(list2);
        System.out.println("list1 is equal to list2: " + isEqual1);

        // Comparing list1 with list3
        boolean isEqual2 = list1.equals(list3);
        System.out.println("list1 is equal to list3: " + isEqual2);
    }
}
```

**Output:**
```
list1 is equal to list2: true
list1 is equal to list3: false
```

In this example:
- `list1` and `list2` are considered equal because they contain the same elements in the same order.
- `list1` and `list3` are not equal because `list3` is missing the element "JavaScript" and is shorter.

### `int hashCode()`

The `hashCode` method returns an integer hash code value for the list. This method is used in hashing-based collections like `HashSet` and `HashMap`. The hash code is based on the list's contents.

#### Example:

```java
import java.util.ArrayList;

public class HashCodeExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("JavaScript");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("JavaScript");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Python");

        // Getting hash codes for the lists
        int hashCode1 = list1.hashCode();
        int hashCode2 = list2.hashCode();
        int hashCode3 = list3.hashCode();

        System.out.println("Hash code of list1: " + hashCode1);
        System.out.println("Hash code of list2: " + hashCode2);
        System.out.println("Hash code of list3: " + hashCode3);

        // Comparing hash codes
        boolean isHashCodeEqual1 = (hashCode1 == hashCode2);
        System.out.println("Hash code of list1 is equal to hash code of list2: " + isHashCodeEqual1);

        boolean isHashCodeEqual2 = (hashCode1 == hashCode3);
        System.out.println("Hash code of list1 is equal to hash code of list3: " + isHashCodeEqual2);
    }
}
```

**Output:**
```
Hash code of list1: 2079801393
Hash code of list2: 2079801393
Hash code of list3: 1904721817
Hash code of list1 is equal to hash code of list2: true
Hash code of list1 is equal to hash code of list3: false
```

In this example:
- `list1` and `list2` have the same hash code because they are equal and have the same elements in the same order.
- `list1` and `list3` have different hash codes because their contents differ.

These examples show how the `equals` and `hashCode` methods work in the context of `ArrayList` and help in comparing and hashing lists.
