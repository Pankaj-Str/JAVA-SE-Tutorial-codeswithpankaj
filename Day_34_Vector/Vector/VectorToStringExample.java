package Day_34_Vector.Vector;
// www.codeswithpankaj.com
import java.util.Vector;

public class VectorToStringExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Convert the Vector to a String
        String colorsString = colors.toString();

        // Print the String representation
        System.out.println("Vector as String: " + colorsString);
    }
}
