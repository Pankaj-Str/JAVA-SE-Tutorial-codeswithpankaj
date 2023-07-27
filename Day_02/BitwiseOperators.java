public class BitwiseOperators {
    public static void main(String[] args) {
        // Bitwise AND (&):

        int a = 5; // 101 in binary
        int b = 3; // 011 in binary
        int result = a & b; // Bitwise AND operation
        System.out.println(result); // Output: 1 (001 in binary)

        // Bitwise OR (|):

        int a1 = 5; // 101 in binary
        int b1 = 3; // 011 in binary
        int result1 = a1 | b1; // Bitwise OR operation
        System.out.println(result1); // Output: 7 (111 in binary)

        // Bitwise XOR (^):

        int a2 = 5; // 101 in binary
        int b2 = 3; // 011 in binary
        int result2 = a2 ^ b2; // Bitwise XOR operation
        System.out.println(result2); // Output: 6 (110 in binary)

        //Bitwise NOT (~):

        int a3 = 5; // 101 in binary
        int result3 = ~a3; // Bitwise NOT operation
        System.out.println(result3); // Output: -6 (complement of 5 in two's complement representation)
    
        // Left Shift (<<):

        int a4 = 5; // 101 in binary
        int result4 = a4 << 2; // Left shift by 2 positions
        System.out.println(result4); // Output: 20 (10100 in binary)

        // Right Shift (>>):

        int a5 = 20; // 10100 in binary
        int result5 = a5 >> 2; // Right shift by 2 positions
        System.out.println(result5); // Output: 5 (101 in binary)
    
    }
}
