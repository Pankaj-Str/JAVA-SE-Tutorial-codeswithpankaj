package Day_15;
// p4n.in
// codeswithpankaj.com
public class This_Keyword {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville", "State");
        Person person = new Person("John", 25, address);

        // Using getters to access the properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Street: " + person.getAddress().getStreet());
        System.out.println("City: " + person.getAddress().getCity());
        System.out.println("State: " + person.getAddress().getState());

        // Using setters to modify the properties
        person.setName("Jane");
        person.setAge(30);
        person.getAddress().setStreet("456 Elm St");
        person.getAddress().setCity("Townsville");
        person.getAddress().setState("New State");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Street: " + person.getAddress().getStreet());
        System.out.println("City: " + person.getAddress().getCity());
        System.out.println("State: " + person.getAddress().getState());
    }
}
