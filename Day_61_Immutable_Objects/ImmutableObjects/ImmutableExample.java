public class ImmutableExample {
    public static void main(String[] args) {
        // Creating an instance of ImmutablePerson
        ImmutablePerson person = new ImmutablePerson("Nishant Chouhan", 30);

        // Accessing the information
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to modify the state of the object will result in a compilation error
        // person.setName("Jane Doe"); // Compilation error

        // Creating a new instance with modified information
        ImmutablePerson newPerson = new ImmutablePerson("Pankaj Chouhan", 32);
        System.out.println("New Person - Name: " + newPerson.getName());
        System.out.println("New Person - Age: " + newPerson.getAge());
    }
}
