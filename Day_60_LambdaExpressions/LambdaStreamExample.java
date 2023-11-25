package Day_60_LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LambdaStreamExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 28),
                new Person("Eva", 35)
        );

        // Use a stream to filter and print people aged 30 and above
        System.out.println("People aged 30 and above:");
        people.stream()
                .filter(person -> person.getAge() >= 30)
                .forEach(System.out::println);

        // Use a stream to calculate the average age of people
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage age: " + averageAge);

        // Use a stream to create a new list with the names of people aged 25 and below
        List<String> namesOfYoungPeople = people.stream()
                .filter(person -> person.getAge() <= 25)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("\nNames of people aged 25 and below: " + namesOfYoungPeople);
    }
}

