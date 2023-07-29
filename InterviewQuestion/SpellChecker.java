package InterviewQuestion;
import java.io.*;
import java.util.*;

public class SpellChecker {
    private static Set<String> dictionary = new HashSet<>();
    private static Set<String> misspelledWords = new TreeSet<>();

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input files provided.");
            return;
        }

        // Read the dictionary file and store words in HashSet
        readDictionary("/dictionary.txt");

        for (String filename : args) {
            System.out.println("File: " + filename);

            // Process each file and find misspelled words
            processFile(filename);

            // Dump out the misspelled words for each file
            System.out.println("Misspelled words:");
            for (String word : misspelledWords) {
                System.out.println(word);
            }

            // Clear the misspelledWords set for the next file
            misspelledWords.clear();
        }
    }

    private static void readDictionary(String dictionaryFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line.toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
        }
    }

    private static void processFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " \t,.;:- %'\"");
                while (st.hasMoreTokens()) {
                    String word = st.nextToken().toLowerCase();

                    // Filter out words that don't start with a letter
                    if (!Character.isLetter(word.charAt(0))) {
                        continue;
                    }

                    // Check if the word is in the dictionary or misspelledWords
                    if (!dictionary.contains(word) && !misspelledWords.contains(word)) {
                        // If the word ends with 's', try removing it to find the singular version
                        if (word.endsWith("s")) {
                            String singularVersion = word.substring(0, word.length() - 1);
                            if (dictionary.contains(singularVersion) || misspelledWords.contains(singularVersion)) {
                                continue;
                            }
                        }

                        // Ask the user to add the word to the dictionary or misspelledWords
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Unknown word: " + word + ". Add to dictionary? (y/n): ");
                        String response = scanner.nextLine();
                        if (response.equalsIgnoreCase("y")) {
                            dictionary.add(word);
                        } else {
                            misspelledWords.add(word);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        }
    }
}
