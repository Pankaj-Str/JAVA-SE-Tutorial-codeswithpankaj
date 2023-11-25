package Day_60_LambdaExpressions;

//Step 1: Define a functional interface with a single abstract method
interface MathOperation {
 int operate(int a, int b);
}

public class LambdaExample {

 public static void main(String[] args) {
     // Step 2: Use lambda expressions to implement the interface

     // Example 1: Addition
     MathOperation addition = (a, b) -> a + b;

     // Example 2: Subtraction
     MathOperation subtraction = (a, b) -> a - b;

     // Example 3: Multiplication
     MathOperation multiplication = (a, b) -> a * b;

     // Example 4: Division
     MathOperation division = (a, b) -> {
         if (b != 0) {
             return a / b;
         } else {
             throw new ArithmeticException("Cannot divide by zero");
         }
     };

     // Step 3: Use lambda expressions in a method
     System.out.println("10 + 5 = " + operate(10, 5, addition));
     System.out.println("10 - 5 = " + operate(10, 5, subtraction));
     System.out.println("10 * 5 = " + operate(10, 5, multiplication));

     try {
         System.out.println("10 / 5 = " + operate(10, 5, division));
         // This will throw an exception
         System.out.println("10 / 0 = " + operate(10, 0, division));
     } catch (ArithmeticException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }

 // Step 4: Use a method that accepts the functional interface
 private static int operate(int a, int b, MathOperation mathOperation) {
     return mathOperation.operate(a, b);
 }
}
