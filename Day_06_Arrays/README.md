# Single-dimensional array

Single-dimensional array is a data structure that allows you to store and access multiple values of the same data type under a single variable name. It is a sequential collection of elements, where each element is identified by its index. The index starts from 0 for the first element and goes up to the length of the array minus one.

Here's a breakdown of the key concepts related to single-dimensional arrays in Java:

Declaration and Initialization:
To create a single-dimensional array, you need to declare the array variable and specify the data type of the elements it will hold. The syntax for declaring an array is:

```java
dataType[] arrayName;
```

For example, to declare an array of integers, you would use:

```java
int[] numbers;
```

To initialize the array with values, you can use an array initializer, where you provide the values enclosed in curly braces `{}`:

```java
int[] numbers = {1, 2, 3, 4, 5};
```

![image](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/537b105a-bb11-461c-a238-91b248bb5759)

Accessing Array Elements:
You can access individual elements of an array using their index. The index represents the position of the element within the array. The syntax to access an element is:

```java
arrayName[index]
```

For example, to access the second element of the `numbers` array, you would use:

```java
int secondNumber = numbers[1];
```

Note that the index starts from 0, so `numbers[1]` refers to the second element.

![7-2](https://github.com/Pankaj-Str/Learn-JAVA-SE/assets/36913690/ae8ab021-9d8a-46f8-84c5-ad21f25c7e38)

Iterating over an Array:
You can use loops, such as `for` or `while`, to iterate over the elements of an array. The most common approach is to use a `for` loop with an index variable that ranges from 0 to `arrayName.length - 1`. Here's an example:

```java
for (int i = 0; i < numbers.length; i++) {
    // Access the element at index i
    int element = numbers[i];
    // Perform operations with the element
}
```

The `length` property of an array gives you the number of elements it contains.

Modifying Array Elements:
You can assign new values to individual elements of an array by using the assignment operator (`=`) with the array element's index. For example:

```java
numbers[2] = 10;
```

This statement assigns the value `10` to the third element of the `numbers` array.

Arrays in Java have several built-in methods and properties that provide useful functionality, such as sorting, searching, and resizing. You can explore the Java documentation for further information on working with arrays.


If you're looking for an example of a single-dimensional array in Java, here's a simple code snippet:

```java
public class SingleArrayExample {
    public static void main(String[] args) {
        // Declare an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
```

In this example, we declare and initialize a single-dimensional array called `fruits` of type `String`. We use an array initializer to provide the initial values of the array. Then, we iterate over the array using a for loop and print each element using the index `i`.

The output of this code will be:

```
Array elements:
Apple
Banana
Orange
Mango
Grapes
```







----------------------------------------------------------------
# Assignment Day 6 
1. Write a Java program that takes user input for an array of integers and calculates the sum and average of the array elements.

2. Billing System (Basic)

```
    -- User input section
Enter Product List Size : 4
Enter Product 1 -
Samosa
Enter Product 2 -
Kachori
Enter Product 3 -
Fafda
Enter Product 4 -
Jalebi

Enter Samosa Price :
300/-
Enter Kachori Price :
100/-
Enter Fafda Price :
100/-
Enter Jalebi Price :
200/-

Do You Want to add GST [Y/N]
[note : if user select `N` Print bill without GST]
[Note User select yes `Y`]
Enter GST % = 18
-------Out put -------

1. Samosa = 300/-
2. Kachori = 100/-
3. Fafda = 100/-
4. Jalebi = 200/-
-------------------
Total = 700
GST = 18%
-------------------
Final Total = 826/-
-------------------
```


# Super Advance Billing System

```java

-- User input section
Enter Product 1 -
Samosa
Enter Samosa Price :
300/-
Enter Samosa QT :
3
-----------------------------
Do you Want to add more [Y/N]
Y
Enter Product 2 -
Kachori
Enter Kachori Price :
100/-
Enter Kachori QT :
2
----------------------------
Do you Want to add more [Y/N]
Y
Enter Product 3 -
Jalebi
Enter Jalebi Price :
200/-
Enter Jalebi QT :
4
Do you Want to add more [Y/N]
N

Do You Want to add GST [Y/N]
[note : if user select `N` Print bill without GST]
[Note User select yes `Y`]
Enter GST % = 18

Select Offer :
1. FLAT 2% OFF
2. FLAT 4% OFF
3. FLAT 8% OFF
[Note if user Select offer = then offer apply into bill] 
if user select [ 1 ]

-------Out put -------

1. Samosa = 900/-
2. Kachori = 200/-
3. Jalebi = 800/-
-------------------
Total = 1900
GST = 18%
offer = 2%
-------------------
Final Total = 2197.16/-
-------------------



```

