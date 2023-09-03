package Day_12;

public class StringMethodsExample {
    public static void main(String[] args) {
        // Initialize a sample string
        String str = "   Java Programming is Fun!   ";

        // charAt(int index): Get the character at a specific index
        char firstChar = str.charAt(0);
        System.out.println("charAt(0): " + firstChar);

        // length(): Get the length of the string
        int length = str.length();
        System.out.println("length(): " + length);

        // substring(int beginIndex): Get a substring starting from the specified index
        String sub1 = str.substring(4);
        System.out.println("substring(4): " + sub1);

        // substring(int beginIndex, int endIndex): Get a substring within the specified range
        String sub2 = str.substring(4, 16);
        System.out.println("substring(4, 16): " + sub2);

        // toUpperCase(): Convert the string to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("toUpperCase(): " + upperCase);

        // toLowerCase(): Convert the string to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("toLowerCase(): " + lowerCase);

        // equals(String anotherString): Compare for content equality
        boolean isEqual = str.equals("   Java Programming is Fun!   ");
        System.out.println("equals(): " + isEqual);

        // startsWith(String prefix): Check if the string starts with the specified prefix
        boolean startsWithJava = str.startsWith("Java");
        System.out.println("startsWith(\"Java\"): " + startsWithJava);

        // endsWith(String suffix): Check if the string ends with the specified suffix
        boolean endsWithFun = str.endsWith("Fun!");
        System.out.println("endsWith(\"Fun!\"): " + endsWithFun);

        // contains(CharSequence sequence): Check if the string contains a specific sequence
        boolean containsIs = str.contains("is");
        System.out.println("contains(\"is\"): " + containsIs);

        // replace(char oldChar, char newChar): Replace characters in the string
        String replacedStr = str.replace(' ', '-');
        System.out.println("replace(' ', '-'): " + replacedStr);

        // trim(): Remove leading and trailing whitespace
        String trimmedStr = str.trim();
        System.out.println("trim(): " + trimmedStr);
    }
}

