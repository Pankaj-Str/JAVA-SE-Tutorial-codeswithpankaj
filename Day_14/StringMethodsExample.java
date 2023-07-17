package Day_14;
//p4n.in 
// codeswithpankaj.com
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // length()
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt()
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);
        
        // substring()
        String sub1 = str.substring(7);
        String sub2 = str.substring(7, 12);
        System.out.println("Substring from index 7 onwards: " + sub1);
        System.out.println("Substring from index 7 to 12: " + sub2);
        
        // concat()
        String concatStr = str.concat(" Welcome!");
        System.out.println("Concatenated string: " + concatStr);
        
        // toUpperCase()
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);
        
        // toLowerCase()
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);
        
        // equals()
        String anotherStr = "Hello, World!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Are the strings equal? " + isEqual);
        
        // startsWith()
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);
        
        // endsWith()
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Does the string end with 'World!'? " + endsWithWorld);
        
        // contains()
        boolean containsWorld = str.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);
        
        // replace()
        String replacedStr = str.replace('o', '0');
        System.out.println("String with 'o' replaced by '0': " + replacedStr);
        
        // trim()
        String trimmedStr = "   Hello, World!   ";
        String trimmed = trimmedStr.trim();
        System.out.println("Trimmed string: " + trimmed);
    }
}
