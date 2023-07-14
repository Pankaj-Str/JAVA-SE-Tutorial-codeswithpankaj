// Write a Program to Check Whether an Alphabet is Vowel or Consonant(user input)
// https://www.codeswithpankaj.com/

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
                || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
    }
}
