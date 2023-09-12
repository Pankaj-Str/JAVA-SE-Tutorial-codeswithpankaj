package Day_10;
// p4n.in
// codeswithpankaj.com
public class Person {
    // Instance variables
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Pankaj", 30, "Engineer");

        // Use the getter methods to retrieve the object's properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Occupation: " + person.getOccupation());

        // Use the setter methods to modify the object's properties
        person.setName("Jane");
        person.setAge(35);
        person.setOccupation("Doctor");

        // Display the modified properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Occupation: " + person.getOccupation());
    }
}
