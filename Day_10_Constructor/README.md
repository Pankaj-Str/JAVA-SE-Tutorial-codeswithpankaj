# Understanding Java Constructors 

## What is a Constructor?
A constructor is a special method in Java that is used to initialize objects. Think of it as a blueprint that tells Java how to create an object of your class. Every time you create a new object using the `new` keyword, a constructor is called.

## Basic Rules of Constructors
1. A constructor must have the same name as the class
2. Constructors don't have a return type (not even void)
3. Constructors are called automatically when an object is created

## Types of Constructors

### 1. Default Constructor
This is the simplest form of constructor. If you don't create any constructor, Java provides one automatically.

```java
public class Student {
    String name;
    int age;
    
    // Default constructor
    public Student() {
        // Empty constructor
    }
}
```

### 2. Parameterized Constructor
This type of constructor takes parameters to initialize object properties.

```java
public class Student {
    String name;
    int age;
    
    // Parameterized constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
}
```

### 3. Multiple Constructors (Constructor Overloading)
You can have multiple constructors in the same class with different parameters.

```java
public class Student {
    String name;
    int age;
    String grade;
    
    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
    }
    
    // Constructor with name only
    public Student(String studentName) {
        name = studentName;
        age = 0;
        grade = "Not Assigned";
    }
    
    // Constructor with all parameters
    public Student(String studentName, int studentAge, String studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }
}
```

## How to Use Constructors

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        
        // Using constructor with name only
        Student student2 = new Student("John");
        
        // Using constructor with all parameters
        Student student3 = new Student("Alice", 20, "A");
    }
}
```

## Best Practices

### 1. Using 'this' Keyword
The `this` keyword refers to the current object. It helps avoid naming conflicts between parameters and instance variables.

```java
public class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;  // 'this.name' refers to instance variable
        this.age = age;    // 'this.age' refers to instance variable
    }
}
```

### 2. Constructor Chaining
You can call one constructor from another using `this()`:

```java
public class Student {
    String name;
    int age;
    String grade;
    
    public Student() {
        this("Unknown", 0, "Not Assigned");  // Calls the full constructor
    }
    
    public Student(String name) {
        this(name, 0, "Not Assigned");  // Calls the full constructor
    }
    
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```

## Common Mistakes to Avoid
1. Don't give constructors a return type
2. Always name the constructor exactly the same as the class
3. Don't try to call a constructor directly (only use the `new` keyword)

## Practice Exercise
Try creating a class called `Car` with these properties:
- brand
- model
- year

Create three different constructors:
1. A default constructor
2. A constructor with brand only
3. A constructor with all properties

This will help you understand how constructors work in practice.