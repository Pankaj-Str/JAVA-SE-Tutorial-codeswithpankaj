# Java I/O Streams

In Java, Input/Output (I/O) streams are a fundamental part of handling input and output operations in a program. Streams are a way to read from or write to various sources or destinations, such as files, network connections, or in-memory data structures. Java provides two types of streams for I/O operations: Byte Streams and Character Streams.

1. Byte Streams:
   Byte streams are used for handling binary data, such as reading/writing images, audio files, or any non-textual data. The two main classes for byte streams are `InputStream` and `OutputStream`.

   - `InputStream`: It is an abstract class that provides methods for reading bytes. Some common subclasses include `FileInputStream` for reading from files and `ByteArrayInputStream` for reading from byte arrays.

   - `OutputStream`: It is an abstract class that provides methods for writing bytes. Some common subclasses include `FileOutputStream` for writing to files and `ByteArrayOutputStream` for writing to byte arrays.

Example of reading and writing bytes using byte streams:

```java
// Reading from a file using FileInputStream
try (InputStream inputStream = new FileInputStream("example.txt")) {
    int data;
    while ((data = inputStream.read()) != -1) {
        // Process the byte data
    }
}

// Writing to a file using FileOutputStream
try (OutputStream outputStream = new FileOutputStream("output.txt")) {
    byte[] data = "Hello, World!".getBytes();
    outputStream.write(data);
}
```

2. Character Streams:
   Character streams are used for handling text data, such as reading/writing text files. The two main classes for character streams are `Reader` and `Writer`.

   - `Reader`: It is an abstract class that provides methods for reading characters. Some common subclasses include `FileReader` for reading from files and `StringReader` for reading from strings.

   - `Writer`: It is an abstract class that provides methods for writing characters. Some common subclasses include `FileWriter` for writing to files and `StringWriter` for writing to strings.

Example of reading and writing characters using character streams:

```java
// Reading from a file using FileReader
try (Reader reader = new FileReader("example.txt")) {
    int data;
    while ((data = reader.read()) != -1) {
        // Process the character data
    }
}

// Writing to a file using FileWriter
try (Writer writer = new FileWriter("output.txt")) {
    writer.write("Hello, World!");
}
```

Java also provides higher-level classes and utility methods for working with streams, such as `BufferedReader`, `BufferedWriter`, `DataInputStream`, and `DataOutputStream`, which offer more convenient ways to handle common I/O operations.

Remember to properly handle exceptions and close streams using the try-with-resources statement (as shown in the examples) to ensure resource cleanup and prevent resource leaks.
