# Java Collections Framework

---

# Module 1: Introduction to Java Collections

## What is Java Collections Framework?

The **Java Collections Framework (JCF)** is a set of classes and interfaces that help us store, manage, retrieve, and manipulate groups of objects efficiently.

Instead of creating arrays with fixed sizes, Java Collections provide **dynamic data structures**.

### Real-Life Example

Imagine a classroom.

Without Collections:

* Fixed-size attendance sheet
* Difficult to add/remove students

With Collections:

* Students can join anytime
* Students can leave anytime
* Easy searching and sorting

Collections make data management much easier.

---

## Why Collections?

Problems with Arrays:

* Fixed Size
* Cannot grow dynamically
* No built-in searching
* No built-in sorting
* Difficult insertion/deletion

Collections solve all these problems.

---

# Module 2: Types of Collections

The Java Collections Framework is divided into two major parts:

```
Collection
│
├── List
├── Set
└── Queue

Map
```

There are two main interfaces:

* Collection Interface
* Map Interface

---

# Module 3: Need of Collections

Collections are used because:

* Dynamic Size
* Fast Searching
* Easy Sorting
* Duplicate Handling
* Easy Data Manipulation
* Ready-made Algorithms

Example:

Instead of writing 100 lines of code for sorting,

Use:

```java
Collections.sort(list);
```

---

# Module 4: Collection Hierarchy

```
                Iterable
                    |
               Collection
      __________|___________
     |          |           |
    List       Set        Queue
     |
-----------------------------
|       |        |          |
ArrayList LinkedList Vector Stack

Set
---------------------
HashSet
LinkedHashSet
TreeSet

Queue
----------------------
PriorityQueue
ArrayDeque

Map
-------------------------
HashMap
LinkedHashMap
TreeMap
Hashtable
```

---

# Module 5: List Interface

## What is List?

List stores elements in insertion order.

Features

* Ordered
* Duplicate Allowed
* Index Based
* Null Allowed

Example

```java
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Rahul");

        System.out.println(students);

    }

}
```

Output

```
[Rahul, Amit, Rahul]
```

---

# Module 6: Types of List

## 1. ArrayList

Features

* Dynamic Array
* Fast Retrieval
* Slow Insertion in Middle

Example

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println(numbers);
```

---

## 2. LinkedList

Features

* Uses Nodes
* Fast Insert/Delete
* Slower Random Access

Example

```java
LinkedList<String> city = new LinkedList<>();

city.add("Mumbai");
city.add("Delhi");

System.out.println(city);
```

---

## 3. Vector

Features

* Thread Safe
* Slower than ArrayList

```java
Vector<Integer> v = new Vector<>();

v.add(100);
v.add(200);

System.out.println(v);
```

---

## 4. Stack

Works on

LIFO (Last In First Out)

```java
Stack<String> stack = new Stack<>();

stack.push("Java");
stack.push("Python");

System.out.println(stack.pop());
```

Output

```
Python
```

---

# Module 7: Set Interface

## What is Set?

Set stores unique elements.

Features

* No Duplicate
* No Index
* Mostly Unordered

---

## Types of Set

### HashSet

* Fastest
* No Order

```java
HashSet<String> set = new HashSet<>();

set.add("Java");
set.add("Python");
set.add("Java");

System.out.println(set);
```

Output

```
[Java, Python]
```

---

### LinkedHashSet

Maintains insertion order.

```java
LinkedHashSet<String> set = new LinkedHashSet<>();

set.add("Java");
set.add("Python");
set.add("C");

System.out.println(set);
```

Output

```
[Java, Python, C]
```

---

### TreeSet

Stores elements in sorted order.

```java
TreeSet<Integer> numbers = new TreeSet<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);

System.out.println(numbers);
```

Output

```
[10, 30, 50]
```

---

# Module 8: Queue Interface

Queue follows

FIFO (First In First Out)

```
Front → 10 → 20 → 30 → Rear
```

---

## PriorityQueue

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(40);
pq.add(10);
pq.add(30);

System.out.println(pq.poll());
```

Output

```
10
```

---

## ArrayDeque

Supports insertion/removal from both ends.

```java
ArrayDeque<String> dq = new ArrayDeque<>();

dq.addFirst("A");
dq.addLast("B");

System.out.println(dq);
```

---

# Module 9: Map Interface

Map stores data as

```
Key → Value
```

Example

```
101 → Rahul
102 → Amit
103 → Neha
```

Features

* Key must be unique
* Value can be duplicate

---

## HashMap

```java
HashMap<Integer,String> student = new HashMap<>();

student.put(101,"Rahul");
student.put(102,"Amit");

System.out.println(student);
```

---

## LinkedHashMap

Maintains insertion order.

---

## TreeMap

Stores keys in sorted order.

---

## Hashtable

Thread Safe

Does not allow null keys or values.

---

# Module 10: Common Collection Methods

```java
add()

remove()

contains()

size()

clear()

isEmpty()

iterator()

forEach()
```

Example

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

System.out.println(list.contains("Java"));
System.out.println(list.size());
```

---

# Module 11: Iterating Collections

Using For Loop

```java
for(String s : list)
{
    System.out.println(s);
}
```

Using Iterator

```java
Iterator<String> itr = list.iterator();

while(itr.hasNext())
{
    System.out.println(itr.next());
}
```

---

# Module 12: Sorting Collections

Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(50);
list.add(10);
list.add(40);
list.add(20);

Collections.sort(list);

System.out.println(list);
```

Output

```
[10,20,40,50]
```

Descending

```java
Collections.sort(list, Collections.reverseOrder());
```

---

# Module 13: Sorting Complex Objects

Suppose we have

Student

```
id
name
marks
```

Student.java

```java
class Student
{
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public String toString()
    {
        return id+" "+name+" "+marks;
    }
}
```

Create Objects

```java
ArrayList<Student> list = new ArrayList<>();

list.add(new Student(101,"Rahul",78));
list.add(new Student(102,"Amit",90));
list.add(new Student(103,"Neha",85));
```

Without Comparable or Comparator,

Java doesn't know how to sort Student objects.

---

# Module 14: Comparable Interface

Comparable is used when the class itself defines its natural sorting order.

Syntax

```java
class Student implements Comparable<Student>
```

Example

```java
class Student implements Comparable<Student>
{
    int id;
    String name;

    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Student s)
    {
        return this.id-s.id;
    }

    public String toString()
    {
        return id+" "+name;
    }
}
```

Sorting

```java
Collections.sort(list);
```

Sorts according to ID.

---

# Module 15: Comparator Interface

Comparator is used when we want multiple sorting logics without modifying the original class.

Example: Sort by Name

```java
Comparator<Student> byName = new Comparator<Student>()
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
};

Collections.sort(list, byName);
```

Sort by Marks

```java
Comparator<Student> byMarks = new Comparator<Student>()
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return Double.compare(s2.marks, s1.marks);
    }
};

Collections.sort(list, byMarks);
```

---

# Comparable vs Comparator

| Feature                 | Comparable      | Comparator     |
| ----------------------- | --------------- | -------------- |
| Package                 | java.lang       | java.util      |
| Method                  | compareTo()     | compare()      |
| Sorting Logic           | Inside Class    | Outside Class  |
| Number of Sorting Rules | One             | Multiple       |
| Modifies Original Class | Yes             | No             |
| Best For                | Natural Sorting | Custom Sorting |

---

# Module 16: Complete Collections Example

```java
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");

        System.out.println("Original : " + list);

        Collections.sort(list);

        System.out.println("Sorted : " + list);

        Set<String> set = new HashSet<>(list);

        System.out.println("Unique : " + set);

        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Rahul");
        map.put(102,"Amit");

        System.out.println(map);

        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");

        System.out.println(queue.poll());

    }

}
```

---

# Summary

* Java Collections Framework stores and manages dynamic data efficiently.
* **List**: Ordered, duplicates allowed, index-based.
* **Set**: Unique elements only.
* **Queue**: FIFO data structure.
* **Map**: Stores key-value pairs with unique keys.
* Use **Collections.sort()** to sort collections.
* Use **Comparable** for a class's default (natural) sorting.
* Use **Comparator** when you need multiple custom sorting strategies.
* Collections make Java programs more efficient, readable, and easier to maintain.
