

# Java Strings 

## Chapter 1: Introduction to String

### What is a String?

A **String** is a sequence of characters enclosed inside double quotes (`"`).

Example:

```java
String name = "Pankaj";
```

Here,

* P
* a
* n
* k
* a
* j

are individual characters.

### Real-Life Example

Imagine your mobile stores:

```
Name : Pankaj
City : Mumbai
Email : abc@gmail.com
```

All these are Strings.

---

## Creating Strings

### Method 1

```java
String s = "Java";
```

### Method 2

```java
String s = new String("Java");
```

Explain the difference between these two methods.

---

## Chapter 2: Memory Segregation in RAM

Explain:

* Stack Memory
* Heap Memory
* String Constant Pool (SCP)

Draw memory diagram.

Example

```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");
```

Explain where each object is stored.

---

## Chapter 3: Types of Strings

### Immutable String

```java
String s = "Hello";
```

Cannot be modified.

---

### Mutable Strings

* StringBuffer
* StringBuilder

Example

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
```

Output

```
Hello Java
```

---

## Chapter 4: Immutable Strings

Explain why String is immutable.

Example

```java
String s = "Java";
s.concat(" Programming");

System.out.println(s);
```

Output

```
Java
```

Now

```java
s = s.concat(" Programming");

System.out.println(s);
```

Output

```
Java Programming
```

Explain why.

---

## Chapter 5: Different Ways of Comparing Strings

### == Operator

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output

```
true
```

---

### equals()

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));
```

Output

```
true
```

---

### compareTo()

```java
System.out.println("Apple".compareTo("Banana"));
```

Explain:

* Positive
* Negative
* Zero

---

### equalsIgnoreCase()

```java
"java".equalsIgnoreCase("JAVA")
```

Output

```
true
```

---

## Chapter 6: Methods Inside String Class

Explain every method with example.

### length()

```java
String s="Programming";
System.out.println(s.length());
```

---

### charAt()

```java
System.out.println(s.charAt(0));
```

---

### substring()

```java
System.out.println(s.substring(3));
```

---

### indexOf()

```java
System.out.println(s.indexOf("g"));
```

---

### lastIndexOf()

```java
System.out.println(s.lastIndexOf("g"));
```

---

### contains()

```java
System.out.println(s.contains("gram"));
```

---

### startsWith()

```java
System.out.println(s.startsWith("Pro"));
```

---

### endsWith()

```java
System.out.println(s.endsWith("ing"));
```

---

### replace()

```java
System.out.println(s.replace("Programming","Java"));
```

---

### replaceAll()

Regular Expression example.

---

### trim()

```java
String s="   Java   ";
System.out.println(s.trim());
```

---

### toUpperCase()

### toLowerCase()

### split()

```java
String s="Java,Python,C++";
String arr[]=s.split(",");
```

Loop through the array.

---

### isEmpty()

### isBlank() (Java 11)

Explain the difference.

---

### join()

```java
String.join("-", "Java","Python","C++");
```

---

### valueOf()

Explain conversion.

---

## Chapter 7: Mutable Strings

Difference between

* String
* StringBuffer
* StringBuilder

Comparison Table

| Feature     | String | StringBuffer | StringBuilder |
| ----------- | ------ | ------------ | ------------- |
| Mutable     | No     | Yes          | Yes           |
| Thread Safe | No     | Yes          | No            |
| Faster      | No     | Medium       | Yes           |

---

## Chapter 8: Concat vs Append

### String concat()

```java
String s="Java";
s=s.concat(" Programming");
```

Creates a new object.

---

### StringBuffer append()

```java
StringBuffer sb=new StringBuffer("Java");
sb.append(" Programming");
```

Modifies the same object.

---

Performance Example

Concatenate 1,00,000 Strings using:

* String
* StringBuffer
* StringBuilder

Measure execution time.

---



