package Base64Encoding_Decoding;

import java.util.Base64;

public class Base64Decoding{

    public static void main(String[] args) {

        String encodedString = "Y29kZXMgd2l0aCBwYW5rYWo=";

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

        String decodedString = new String(decodedBytes);

        System.out.println("Encoded String: " + encodedString);

        System.out.println("Decoded String: " + decodedString);

    }

}