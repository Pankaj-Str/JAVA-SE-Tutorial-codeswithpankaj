# Java Encapsulation

Encapsulation is one of the four fundamental principles of object-oriented programming (OOP), along with inheritance, polymorphism, and abstraction. In Java, encapsulation refers to the concept of hiding the internal state (data) of an object and providing access to it through public methods. It helps in controlling and protecting the data from unauthorized access or modification, promoting data integrity, and facilitating code maintainability and flexibility.

The key principles of encapsulation in Java are:

1. **Private Data Members:** Declare the instance variables (fields) of a class as private, making them accessible only within the class. This prevents direct access to the internal state of the object from outside the class.

2. **Public Methods:** Provide public methods (getters and setters) that allow controlled access to the private data members. These methods are used to read and modify the object's state.

3. **Getter Methods:** Getter methods (also known as accessor methods) are used to retrieve the values of private fields. They are typically named with the prefix "get."

4. **Setter Methods:** Setter methods (also known as mutator methods) are used to modify the values of private fields. They are typically named with the prefix "set."

Here's an example of encapsulation in Java:

```java
public class Student {
    // Private data members
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }
}
```

In this example:

- The `Student` class has private data members `name` and `age`.

- Public getter and setter methods are provided for both `name` and `age`. These methods allow controlled access to the private fields. The setter for `age` includes validation to ensure that the age is non-negative.

- Encapsulation ensures that the `name` and `age` fields can only be accessed and modified through the provided methods. This protects the integrity of the object's data.

- Encapsulation also allows the class to change its internal implementation without affecting the code that uses it, providing flexibility and maintainability.

Here's how you can use the `Student` class:

```java
public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);

        // Accessing and modifying data through getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
```

Encapsulation helps in maintaining control over the object's data and ensures that it is accessed and modified in a controlled and predictable manner.