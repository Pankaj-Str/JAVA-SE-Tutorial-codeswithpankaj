public class MutableExample1 {
    public static void main(String[] args) {
        // Creating an instance of MutablePerson
        MutablePerson person = new MutablePerson("Pankaj Chouhan", 25);

        // Printing the initial state
        System.out.println("Initial Person: " + person);

        // Modifying the state using setter methods
        person.setName("Pankaj Chouhan");
        person.setAge(30);

        // Printing the updated state
        System.out.println("Updated Person: " + person);

        // Creating a new instance with modified information
        MutablePerson newPerson = new MutablePerson("Nishant", 28);

        // Printing the new person
        System.out.println("New Person: " + newPerson);
    }
}
