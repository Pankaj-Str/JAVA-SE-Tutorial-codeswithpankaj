package Day_57_IO_Streams.JavaOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            // Create an OutputStream for writing to a file
            OutputStream outputStream = new FileOutputStream("output.txt");

            // Data to write to the file
            String data = "Hello, World!";

            // Convert the data to bytes and write it to the file
            byte[] byteData = data.getBytes();
            outputStream.write(byteData);

            // Close the output stream to release resources
            outputStream.close();

            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
