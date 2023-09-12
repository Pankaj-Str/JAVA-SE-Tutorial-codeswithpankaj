# Java Constructor

Java constructor example that demonstrates a basic usage of constructors:

```java
public class cwp {

    // Instance variables
    private String message;

    // Constructor with a single parameter
    public cwp(String initialMessage) {
        message = initialMessage;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        cwp p4n = new cwp("Hello, Constructors!");

        // Call the displayMessage method to show the message
        p4n.displayMessage();
    }
}
```

In this example:

1. We have a class called `cwp`.

2. Inside the class, we define an instance variable `message` to store a message.

3. We create a constructor that takes a single parameter `initialMessage`. This constructor initializes the `message` instance variable with the value provided as an argument.

4. We define a method `displayMessage()` that prints the value of the `message` instance variable.

5. In the `main` method, we create an instance of the `cwp` class using the constructor and pass the message "Hello, Constructors!" as an argument.

6. Finally, we call the `displayMessage()` method on the created object to display the message.

When you run this Java program, it will output:

```
Message: Hello, Constructors!
```

This demonstrates the use of a constructor to initialize the state of an object when it is created.

### Example 02:

```java
public class codeswithpankaj {
    // Instance variables
    private String courseName;
    private int courseDuration;

    // Constructor with two parameters
    public codeswithpankaj(String name, int duration) {
        courseName = name;
        courseDuration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration (in weeks): " + courseDuration);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        codeswithpankaj course = new codeswithpankaj("Java Programming", 12);

        // Call the displayCourseDetails method to show the course details
        course.displayCourseDetails();
    }
}
```

In this example:

1. We have a class named `codeswithpankaj`.

2. Inside the class, we define two instance variables: `courseName` to store the name of the course and `courseDuration` to store the duration of the course in weeks.

3. We create a constructor that takes two parameters: `name` (for the course name) and `duration` (for the course duration). This constructor initializes the instance variables with the values provided as arguments.

4. We define a method `displayCourseDetails()` that prints the course name and duration.

5. In the `main` method, we create an instance of the `codeswithpankaj` class using the constructor and pass "Java Programming" as the course name and 12 as the course duration.

6. Finally, we call the `displayCourseDetails()` method on the created object to display the course details.

When you run this Java program, it will output:

```
Course Name: Java Programming
Course Duration (in weeks): 12
```

This demonstrates the use of a constructor to initialize the state of an object of the `codeswithpankaj` class.
