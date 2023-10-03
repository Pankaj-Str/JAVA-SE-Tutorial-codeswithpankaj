package Day_57_IO_Streams.JavaInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            // Create an InputStream for reading from a file
            InputStream inputStream = new FileInputStream("example.txt");

            // Read and process data from the file
            int data;
            while ((data = inputStream.read()) != -1) {
                // Convert the integer data to a character and print it
                char character = (char) data;
                System.out.print(character);
            }

            // Close the input stream to release resources
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
