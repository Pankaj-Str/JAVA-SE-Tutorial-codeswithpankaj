# Java Interview Question and Answer 

1. **Question:** Explain the difference between `==` and `.equals()` in Java.

   **Answer:** `==` is used for comparing primitive data types or checking if two references point to the same object, while `.equals()` is a method used to compare the contents of objects.

2. **Question:** What is the difference between `ArrayList` and `LinkedList`?

   **Answer:** `ArrayList` uses a dynamic array to store elements, providing fast random access but slower insertion and deletion. `LinkedList` uses a doubly-linked list, offering faster insertion and deletion but slower random access.

3. **Question:** How does Java handle multithreading?

   **Answer:** Java supports multithreading through the `Thread` class and the `Runnable` interface. Synchronization mechanisms like `synchronized` keyword and `Lock` interfaces are used to control access to shared resources.

4. **Question:** What is the purpose of the `static` keyword in Java?

   **Answer:** The `static` keyword is used to declare members (variables and methods) that belong to the class rather than instances of the class. Static members are shared among all instances of the class.

5. **Question:** Explain the concept of exception handling in Java.

   **Answer:** Exception handling in Java is done using `try`, `catch`, `finally`, `throw`, and `throws`. Exceptions represent errors or unexpected events, and proper handling ensures graceful program execution.

6. **Question:** What is the Java Virtual Machine (JVM) and its role in Java?

   **Answer:** JVM is an abstract machine that provides a runtime environment for Java bytecode execution. It translates Java bytecode into machine-specific instructions and manages memory, security, and other runtime aspects.

7. **Question:** Differentiate between `final`, `finally`, and `finalize` in Java.

   **Answer:** `final` is used to declare constants, `finally` is a block used in exception handling that always executes, and `finalize` is a method called by the garbage collector before reclaiming an object.

8. **Question:** What is the significance of the `transient` keyword in Java?

   **Answer:** The `transient` keyword is used to indicate that a variable should not be serialized during object serialization. It excludes the marked variable from the serialization process.

9. **Question:** Explain the concept of polymorphism in Java.

   **Answer:** Polymorphism allows objects of different types to be treated as objects of a common type. In Java, this is achieved through method overloading and method overriding.

10. **Question:** How does Java support garbage collection?

    **Answer:** Java uses automatic garbage collection to reclaim memory occupied by objects that are no longer reachable. The garbage collector identifies and removes objects without any live references.




