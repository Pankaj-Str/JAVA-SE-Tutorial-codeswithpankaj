package Day_22_Encapsulation.JavaEncapsulation;

public class Student {
    private String name; // Private data member
    private int age;     // Private data member

    // Constructor to initialize name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to retrieve the name
    public String getName() {
        return name;
    }

    // Setter method to modify the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the age
    public int getAge() {
        return age;
    }

    // Setter method to modify the age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }
}

