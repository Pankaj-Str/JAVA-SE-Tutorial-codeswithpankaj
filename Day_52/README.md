# Java EnumSet
The EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.

In Java, an `EnumSet` is a specialized set implementation that is designed to work exclusively with enum types. It is part of the Java Collections Framework and provides efficient and type-safe manipulation of sets of enum constants. `EnumSet` is particularly useful when you want to work with a set of enum values because it takes advantage of the specific characteristics of enum types to offer performance benefits.

Here's how you can create and use an `EnumSet` in Java:

```java
import java.util.EnumSet;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet for DayOfWeek enum
        EnumSet<DayOfWeek> workDays = EnumSet.of(
            DayOfWeek.MONDAY,
            DayOfWeek.TUESDAY,
            DayOfWeek.WEDNESDAY,
            DayOfWeek.THURSDAY,
            DayOfWeek.FRIDAY
        );

        // Adding an enum constant
        workDays.add(DayOfWeek.SATURDAY);

        // Removing an enum constant
        workDays.remove(DayOfWeek.WEDNESDAY);

        // Checking if an enum constant is present
        boolean isSundayPresent = workDays.contains(DayOfWeek.SUNDAY); // false

        // Iterating through the EnumSet
        for (DayOfWeek day : workDays) {
            System.out.println(day);
        }
    }
}
```

In this example, we define an `EnumSet` called `workDays` that initially contains the weekdays (Monday through Friday). We then add Saturday to the set and remove Wednesday. Finally, we check if Sunday is present (which it isn't), and we iterate through the `EnumSet`.

`EnumSet` is particularly efficient and memory-friendly when working with enums because it internally uses bit vectors for better performance. It's a great choice when you need to represent sets of enum constants.

## 1. Using allOf(Size)

If you want to create an `EnumSet` containing all the elements of an enum using `allOf`, you can do so as follows:

Assuming you have an enum called `Size`:

```java
import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, XLARGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create an EnumSet containing all elements of the Size enum
        EnumSet<Size> allSizes = EnumSet.allOf(Size.class);

        // Printing the contents of the EnumSet
        for (Size size : allSizes) {
            System.out.println(size);
        }
    }
}
```

In this example, `EnumSet.allOf(Size.class)` creates an `EnumSet` that contains all the enum constants defined in the `Size` enum. It's a convenient way to initialize an `EnumSet` with all the values of an enum.

## 2. Using noneOf(Size)

If you want to create an empty `EnumSet` for an enum using `noneOf`, you can do so as follows:

Assuming you have an enum called `Size`:

```java
import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, XLARGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create an empty EnumSet for the Size enum
        EnumSet<Size> emptySizes = EnumSet.noneOf(Size.class);

        // Printing the contents of the empty EnumSet (which will be empty)
        for (Size size : emptySizes) {
            System.out.println(size); // This loop won't print anything because the set is empty.
        }
    }
}
```

In this example, `EnumSet.noneOf(Size.class)` creates an empty `EnumSet` for the `Size` enum. This is useful when you want to start with an empty set and add enum constants to it later as needed.

## 3. Using range(e1, e2) Method

In Java, you can create an `EnumSet` containing a range of enum constants using the `range(e1, e2)` method. This method allows you to specify a starting enum constant (`e1`) and an ending enum constant (`e2`), and it includes all the constants in the range from `e1` to `e2`, inclusive. Here's an example:

Assuming you have an enum called `Size`:

```java
import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, XLARGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create an EnumSet for the range MEDIUM to LARGE (inclusive)
        EnumSet<Size> sizeRange = EnumSet.range(Size.MEDIUM, Size.LARGE);

        // Printing the contents of the EnumSet
        for (Size size : sizeRange) {
            System.out.println(size);
        }
    }
}
```

In this example, `EnumSet.range(Size.MEDIUM, Size.LARGE)` creates an `EnumSet` that contains the enum constants from `MEDIUM` to `LARGE`, inclusive. The output will be:

```
MEDIUM
LARGE
```

This is a convenient way to create an `EnumSet` that represents a specific range of enum constants within your enum type.

## 4. Using of() Method

In Java, you can create an `EnumSet` with specific enum constants using the `of()` method. This method allows you to specify individual enum constants as arguments and creates an `EnumSet` containing those specified constants. Here's an example:

Assuming you have an enum called `Color`:

```java
import java.util.EnumSet;

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create an EnumSet containing specific Color enum constants
        EnumSet<Color> primaryColors = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);

        // Printing the contents of the EnumSet
        for (Color color : primaryColors) {
            System.out.println(color);
        }
    }
}
```

In this example, `EnumSet.of(Color.RED, Color.GREEN, Color.BLUE)` creates an `EnumSet` that contains the enum constants `RED`, `GREEN`, and `BLUE`. The output will be:

```
RED
GREEN
BLUE
```

This allows you to create an `EnumSet` with specific enum constants tailored to your requirements.

## Methods of EnumSet

`EnumSet` provides several methods for working with enum sets. Here's a list of some commonly used methods:

1. `of(E e1, E e2, ..., E eN)`: Creates an `EnumSet` containing the specified enum constants.

2. `allOf(Class<E> elementType)`: Creates an `EnumSet` containing all the enum constants of the specified enum type.

3. `noneOf(Class<E> elementType)`: Creates an empty `EnumSet` for the specified enum type.

4. `copyOf(Collection<E> c)`: Creates an `EnumSet` containing all the elements from the specified collection.

5. `range(E from, E to)`: Creates an `EnumSet` containing enum constants from `from` to `to`, inclusive.

6. `add(E e)`: Adds the specified enum constant to the `EnumSet`.

7. `remove(E e)`: Removes the specified enum constant from the `EnumSet`.

8. `contains(E e)`: Checks if the `EnumSet` contains the specified enum constant.

9. `size()`: Returns the number of elements in the `EnumSet`.

10. `isEmpty()`: Checks if the `EnumSet` is empty.

11. `clear()`: Removes all elements from the `EnumSet`.

12. `equals(Object o)`: Compares the `EnumSet` to another object for equality.

13. `hashCode()`: Returns the hash code of the `EnumSet`.

14. `iterator()`: Returns an iterator over the elements in the `EnumSet`.

15. `complementOf(EnumSet<E> s)`: Returns an `EnumSet` containing all elements not present in the specified `EnumSet`.

These methods provide various ways to create, manipulate, and query `EnumSet` instances for enum types in Java.

1. `of(E e1, E e2, ..., E eN)`: Creates an `EnumSet` containing the specified enum constants.

```java
import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

        // Printing the contents of the EnumSet
        for (Day day : weekdays) {
            System.out.println(day);
        }
    }
}
```

2. `allOf(Class<E> elementType)`: Creates an `EnumSet` containing all the enum constants of the specified enum type.

```java
import java.util.EnumSet;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet containing all enum constants of the Month enum
        EnumSet<Month> allMonths = EnumSet.allOf(Month.class);

        // Printing the contents of the EnumSet
        for (Month month : allMonths) {
            System.out.println(month);
        }
    }
}
```

3. `noneOf(Class<E> elementType)`: Creates an empty `EnumSet` for the specified enum type.

```java
import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an empty EnumSet for the Season enum
        EnumSet<Season> emptySeasons = EnumSet.noneOf(Season.class);

        // Checking if it's empty
        boolean isEmpty = emptySeasons.isEmpty();
        System.out.println("Is it empty? " + isEmpty); // Is it empty? true
    }
}
```

4. `copyOf(Collection<E> c)`: Creates an `EnumSet` containing all the elements from the specified collection.

```java
import java.util.EnumSet;
import java.util.ArrayList;
import java.util.Collection;

enum Color {
    RED, GREEN, BLUE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create a collection of Color enum constants
        Collection<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);

        // Create an EnumSet from the collection
        EnumSet<Color> colorSet = EnumSet.copyOf(colors);

        // Printing the contents of the EnumSet
        for (Color color : colorSet) {
            System.out.println(color);
        }
    }
}
```

5. `range(E from, E to)`: Creates an `EnumSet` containing enum constants from `from` to `to`, inclusive.

```java
import java.util.EnumSet;

enum Size {
    SMALL, MEDIUM, LARGE, XLARGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with a range of enum constants
        EnumSet<Size> sizeRange = EnumSet.range(Size.MEDIUM, Size.LARGE);

        // Printing the contents of the EnumSet
        for (Size size : sizeRange) {
            System.out.println(size);
        }
    }
}
```

6. `add(E e)`: Adds the specified enum constant to the `EnumSet`.

```java
import java.util.EnumSet;

enum Color {
    RED, GREEN, BLUE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an empty EnumSet for Color
        EnumSet<Color> colors = EnumSet.noneOf(Color.class);

        // Adding enum constants to the EnumSet
        colors.add(Color.RED);
        colors.add(Color.GREEN);

        // Printing the contents of the EnumSet
        for (Color color : colors) {
            System.out.println(color);
        }
    }
}
```

7. `remove(E e)`: Removes the specified enum constant from the `EnumSet`.

```java
import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

        // Removing an enum constant from the EnumSet
        weekdays.remove(Day.TUESDAY);

        // Printing the contents of the EnumSet
        for (Day day : weekdays) {
            System.out.println(day);
        }
    }
}
```

8. `contains(E e)`: Checks if the `EnumSet` contains the specified enum constant.

```java
import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Season> seasons = EnumSet.of(Season.SPRING, Season.SUMMER, Season.AUTUMN);

        // Checking if an enum constant is in the EnumSet
        boolean containsWinter = seasons.contains(Season.WINTER); // false

        // Printing the result
        System.out.println("Contains Winter: " + containsWinter);
    }
}
```

9. `size()`: Returns the number of elements in the `EnumSet`.

```java
import java.util.EnumSet;

enum Fruit {
    APPLE, BANANA, ORANGE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Fruit> fruits = EnumSet.of(Fruit.APPLE, Fruit.BANANA);

        // Get the size of the EnumSet
        int setSize = fruits.size();

        // Printing the size
        System.out.println("Size of EnumSet: " + setSize); // Size of EnumSet: 2
    }
}
```

10. `isEmpty()`: Checks if the `EnumSet` is empty.

```java
import java.util.EnumSet;

enum Color {
    RED, GREEN, BLUE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an empty EnumSet for Color
        EnumSet<Color> colors = EnumSet.noneOf(Color.class);

        // Check if the EnumSet is empty
        boolean isEmpty = colors.isEmpty();

        // Printing the result
        System.out.println("Is the EnumSet empty? " + isEmpty); // Is the EnumSet empty? true
    }
}
```

11. `clear()`: Removes all elements from the `EnumSet`.

```java
import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

        // Clear all elements from the EnumSet
        weekdays.clear();

        // Check if the EnumSet is empty after clearing
        boolean isEmpty = weekdays.isEmpty();

        // Printing the result
        System.out.println("Is the EnumSet empty after clearing? " + isEmpty); // Is the EnumSet empty after clearing? true
    }
}
```

12. `equals(Object o)`: Compares the `EnumSet` to another object for equality.

```java
import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating two EnumSets with the same enum constants
        EnumSet<Season> set1 = EnumSet.of(Season.SPRING, Season.SUMMER);
        EnumSet<Season> set2 = EnumSet.of(Season.SPRING, Season.SUMMER);

        // Comparing the two EnumSets for equality
        boolean areEqual = set1.equals(set2);

        // Printing the result
        System.out.println("Are the EnumSets equal? " + areEqual); // Are the EnumSets equal? true
    }
}
```

13. `hashCode()`: Returns the hash code of the `EnumSet`.

```java
import java.util.EnumSet;

enum Color {
    RED, GREEN, BLUE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Color> colors = EnumSet.of(Color.RED, Color.GREEN);

        // Get the hash code of the EnumSet
        int hashCode = colors.hashCode();

        // Printing the hash code
        System.out.println("Hash code of EnumSet: " + hashCode);
    }
}
```

14. `iterator()`: Returns an iterator over the elements in the `EnumSet`.

```java
import java.util.EnumSet;
import java.util.Iterator;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

        // Get an iterator over the elements in the EnumSet
        Iterator<Day> iterator = weekdays.iterator();

        // Iterating and printing the elements
        while (iterator.hasNext()) {
            Day day = iterator.next();
            System.out.println(day);
        }
    }
}
```

15. `complementOf(EnumSet<E> s)`: Returns an `EnumSet` containing all elements not present in the specified `EnumSet`.

```java
import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet with specified enum constants
        EnumSet<Day> workDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);

        // Creating an EnumSet that complements the workDays EnumSet
        EnumSet<Day> weekendDays = EnumSet.complementOf(workDays);

        // Printing the contents of the complement EnumSet
        for (Day day : weekendDays) {
            System.out.println(day);
        }
    }
}
```



