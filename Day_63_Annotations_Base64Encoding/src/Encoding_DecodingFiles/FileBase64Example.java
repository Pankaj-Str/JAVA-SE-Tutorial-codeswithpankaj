package Encoding_DecodingFiles;

import java.util.Base64;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.io.IOException;

public class FileBase64Example {

    public static void main(String[] args) {

        try {

            // Read file and encode it to Base64

            byte[] fileContent = Files.readAllBytes(Paths.get("p4n.txt"));

            String encodedString = Base64.getEncoder().encodeToString(fileContent);

            System.out.println("Encoded File String: " + encodedString);

            // Decode Base64 string back to file

            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

            Files.write(Paths.get("decoded_p4n.txt"), decodedBytes);

            System.out.println("File successfully decoded!");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}