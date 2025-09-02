public class StringAdvance {


    public static void main(String[] args) {
        
        // String buffer

        StringBuffer sb = new StringBuffer("Sumit");

        System.out.println(sb);

        System.out.println(sb.append("yadav"));

        System.out.println(sb.equals("hello"));

// append(): Appends various data types (String, char, int, boolean, etc.) to the end of the StringBuffer.
System.out.println(sb.append("jain"));
// insert(): Inserts data types at a specified offset within the StringBuffer.
System.out.println(sb.insert(3,"java"));
// delete(): Removes a range of characters from the StringBuffer based on start and end indices.
sb.delete(2, 5);
// replace(): Replaces a specified range of characters with a new string.
// reverse(): Reverses the sequence of characters in the StringBuffer.
// charAt(): Returns the character at a specified index.
// setCharAt(): Sets the character at a specified index.
// length(): Returns the current length (number of characters) of the StringBuffer.
// capacity(): Returns the current capacity of the StringBuffer, which is the amount of storage available.
// ensureCapacity(): Ensures that the StringBuffer has at least a specified minimum capacity.
// trimToSize(): Reduces the storage capacity of the StringBuffer to the actual length of the character sequence.
// toString(): Converts the StringBuffer object to a String object.


    }
    
}
