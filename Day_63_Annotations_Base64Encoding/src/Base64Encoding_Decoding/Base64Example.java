package Base64Encoding_Decoding;
import java.util.Base64;

public class Base64Example {

    public static void main(String[] args) {

        String originalString = "codes with pankaj";

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        System.out.println("Original String: " + originalString);

        System.out.println("Encoded String: " + encodedString);

    }

}