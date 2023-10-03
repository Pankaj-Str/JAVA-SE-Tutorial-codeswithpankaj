# Java FileInputStream

`FileInputStream` is a class in Java that allows you to create an input stream for reading data from a file. It's part of the Java I/O (Input/Output) classes and is commonly used for reading binary data or text from files on your file system.

Here's how you typically use `FileInputStream` in Java:

1. Import the necessary classes:

```java
import java.io.FileInputStream;
import java.io.IOException;
```

2. Create an instance of `FileInputStream` by specifying the path to the file you want to read:

```java
try (FileInputStream fis = new FileInputStream("example.txt")) {
    // Read data from the FileInputStream
    int data;
    while ((data = fis.read()) != -1) {
        // Process the data
        System.out.print((char) data);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

In the code above, we create a `FileInputStream` called `fis` that reads data from the file "example.txt." We use a loop to read bytes from the stream and process them. In this example, we convert each byte to a character and print it.

3. Close the `FileInputStream` when you're done with it. The `try-with-resources` statement is used here to automatically close the stream after exiting the try block. Closing the stream is important to release system resources and ensure that the file is properly closed.

`FileInputStream` is useful for reading data from files on your local file system. You can use it to read various types of files, including text files, binary files, and more.

Keep in mind that you should handle exceptions, as shown in the example, to deal with any errors that may occur during file operations, such as file not found or I/O errors. Additionally, it's good practice to close the `FileInputStream` when you're done to free up system resources and avoid resource leaks.