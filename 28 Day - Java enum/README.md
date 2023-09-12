### Java enum Class
### Java enum Constructor
### Java enum String

# Java enum Class

An enum (short for "enumeration") is a special data type used to define a set of named constant values. Enumerations are often used to represent a fixed set of related constants, such as days of the week, months, or status codes, in a more structured and type-safe way. Enum constants are implicitly final and can't be changed after they are defined.

Here's how you can declare and use an enum class in Java:

```java
public enum Day {
    SUNDAY,    // Enum constants (implicitly public static final)
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Accessing enum constants
        Day today = Day.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            // ... other cases ...
            default:
                System.out.println("It's not a special day.");
        }

        // Enum values() method to iterate through all constants
        Day[] daysOfWeek = Day.values();
        for (Day day : daysOfWeek) {
            System.out.println(day);
        }
    }
}
```

In this example:

- We define an `enum` class called `Day`, which represents the days of the week as enum constants. Enum constants are typically written in uppercase letters.

- In the `EnumExample` class, we access the enum constants and use them in a `switch` statement to print a message based on the current day.

- The `values()` method of the enum is used to retrieve an array of all enum constants, allowing you to iterate through them.

Enums are especially useful when you need a fixed set of related values and want to ensure type safety. They also provide a clear and concise way to represent and work with such constants in your code.

# Java enum Constructor

You can create constructors for enum types, just like you can for classes. Enum constructors are typically private and are used to initialize the enum constants when they are defined. Here's how you can define a constructor for an enum:

```java
public enum MyEnum {
    VALUE1("This is the first value"),
    VALUE2("This is the second value"),
    VALUE3("This is the third value");

    private String description;

    // Private constructor for enum
    private MyEnum(String description) {
        this.description = description;
    }

    // Getter method to access the description
    public String getDescription() {
        return description;
    }
}
```

In this example, `MyEnum` is an enum type with three constants: `VALUE1`, `VALUE2`, and `VALUE3`. Each constant has a private constructor that takes a `String` parameter `description` and initializes an instance variable with it. You can also see a getter method `getDescription()` that allows you to access the description associated with each enum constant.

Here's how you can use this enum:

```java
public class EnumExample {
    public static void main(String[] args) {
        MyEnum value = MyEnum.VALUE1;
        System.out.println(value.getDescription()); // Output: This is the first value
    }
}
```

By defining constructors for enum constants, you can initialize them with specific values or behavior when they are defined in the enum declaration.


# Java enum String

The string representation of an enum constant by calling its `name()` method, which returns the name of the enum constant as a string. Here's an example:

```java
public enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3
}

public class EnumToStringExample {
    public static void main(String[] args) {
        MyEnum value = MyEnum.VALUE1;
        String enumString = value.name();

        System.out.println(enumString); // Output: VALUE1
    }
}
```

In this example, `value.name()` returns the string "VALUE1" because the `value` variable is set to the `MyEnum.VALUE1` enum constant.

If you want to obtain a custom string representation for an enum constant, you can define an instance variable and a constructor in the enum and then use that instance variable to return the desired string representation:

```java
public enum MyEnum {
    VALUE1("First Value"),
    VALUE2("Second Value"),
    VALUE3("Third Value");

    private String customString;

    // Private constructor for enum
    private MyEnum(String customString) {
        this.customString = customString;
    }

    // Getter method to access the custom string
    public String getCustomString() {
        return customString;
    }
}

public class EnumCustomToStringExample {
    public static void main(String[] args) {
        MyEnum value = MyEnum.VALUE1;
        String customString = value.getCustomString();

        System.out.println(customString); // Output: First Value
    }
}
```

In this example, each enum constant has a custom string associated with it, and the `getCustomString()` method is used to obtain this custom string.