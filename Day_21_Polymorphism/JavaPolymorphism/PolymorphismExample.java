package Day_21_Polymorphism.JavaPolymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog(); // Polymorphic reference to a Dog object
        Animal myAnimal2 = new Cat(); // Polymorphic reference to a Cat object

        myAnimal1.makeSound(); // Calls the 'makeSound' method of Dog
        myAnimal2.makeSound(); // Calls the 'makeSound' method of Cat
    }
}

