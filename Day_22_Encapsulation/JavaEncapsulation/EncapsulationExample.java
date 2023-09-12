package Day_23;

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access and modify the student's information using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        // Attempt to set an invalid age
        student.setAge(-5);
    }
}

