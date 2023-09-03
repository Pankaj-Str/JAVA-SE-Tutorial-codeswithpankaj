# the `super` keyword

The `super` keyword is used to refer to the immediate parent class (superclass) of a class. It can be used in various contexts to access or call members (fields, methods, constructors) of the superclass. The primary purposes of the `super` keyword are:

1. **Accessing Superclass Members:** You can use `super` to access fields or methods of the superclass when they are shadowed or overridden in the subclass. This helps disambiguate between superclass and subclass members with the same name.

2. **Calling Superclass Constructors:** You can use `super` to call a constructor of the superclass from a constructor of the subclass. This is often done to reuse the initialization code of the superclass.

Here are the main uses of the `super` keyword:

**1. Accessing Superclass Members:**
```java
class Animal {
    String name = "Animal";

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void makeSound() {
        System.out.println(super.name); // Accessing the 'name' field of the superclass
        super.makeSound(); // Calling the 'makeSound' method of the superclass
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
```

In this example, the `super` keyword is used in the `Dog` class to access the `name` field and `makeSound` method of the `Animal` superclass.

**2. Calling Superclass Constructors:**
```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass 'Animal'
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Name: " + super.name); // Accessing 'name' from superclass
        System.out.println("Breed: " + breed);
    }
}

public class SuperKeywordConstructorExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo();
    }
}
```

In this example, the `super` keyword is used in the `Dog` constructor to call the constructor of the superclass `Animal`.

The `super` keyword is a powerful tool for working with class hierarchies and ensuring that you can access or extend the behavior of the superclass in a controlled manner.