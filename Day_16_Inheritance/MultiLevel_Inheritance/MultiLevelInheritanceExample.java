package Day_16_Inheritance.MultiLevel_Inheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Subclass inheriting from Dog
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("The German Shepherd is guarding.");
    }
}

public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        GermanShepherd myDog = new GermanShepherd();

        // The GermanShepherd class inherits the eat() and bark() methods
        myDog.eat();
        myDog.bark();

        // It also has its own method guard()
        myDog.guard();
    }
}

