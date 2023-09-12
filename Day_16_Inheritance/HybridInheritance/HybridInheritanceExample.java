package Day_17.HybridInheritance;

// Interface for swimming behavior
interface Swimmer {
    void swim();
}

// Superclass
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass 1 inheriting from Animal and implementing Swimmer interface
class Fish extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}

// Subclass 2 inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        Dog myDog = new Dog();

        // Fish inherits eat() from Animal and implements swim() from Swimmer
        myFish.eat();
        myFish.swim();

        // Dog inherits eat() from Animal and has its own method bark()
        myDog.eat();
        myDog.bark();
    }
}

