
class Operator {

    public static void main(String[] arg) {

        // Arithmetic Operators:
        // Addition (+): Adds two operands.
        System.out.println(343 + 67);
        // Subtraction (-): Subtracts the right operand from the left operand.
        System.out.println(343 - 67);
        // Multiplication (*): Multiplies two operands.
        System.out.println(34 * 67);
        // Division (/): Divides the left operand by the right operand.
        System.out.println(343 / 67);
        // Modulus (%): Returns the remainder after division.
        System.out.println(34 % 67);

        // Assignment Operators:
        // Simple Assignment (=): Assigns a value to a variable.

        int number = 90;

        System.out.println(number);

        // Compound Assignment Operators (+=, -=, *=, /=, %=): Performs an arithmetic
        // operation and assigns the result to the left operand.

        // number = number + 10;
        number += 10;
        System.out.println(number);
        number -= 10;
        System.out.println(number);
        number *= 10;
        System.out.println(number);
        number /= 10;
        System.out.println(number);
        number %= 10;
        System.out.println(number);

        // Increment and Decrement Operators:

        // Increment (++) and Decrement (--): Increases or decreases the value of a
        // variable by 1.

        int a = 10;
        a++;

        System.out.println(a);
        a--;
        System.out.println(a);

        // Comparison Operators:

        // Equal to (==): Checks if two operands are equal.

        System.out.println(34 == 45);

        // Not equal to (!=): Checks if two operands are not equal.

        System.out.println(34 != 45);

        // Greater than (>),
        System.out.println(45 > 67);
        // Less than (<),
        System.out.println(45 < 89);
        // Greater than or equal to (>=),
        System.out.println(45 >= 34);
        // Less than or equal to (<=):
        System.out.println(45 <= 23);
        // Perform comparison between operands.
        // Logical Operators:

        // Logical AND (&&): Returns true if both operands are true.
        // Logical OR (||): Returns true if either operand is true.
        // Logical NOT (!): Reverses the logical state of an operand.

        // and &&
        // left side | right side = result
        // T | T = T
        // T | F = F
        // F | T = F
        // F | F = F
        System.out.println(56 < 90 && 676 <= 78);

        // or ||
        // left side | right side = result
        // T | T = T
        // T | F = T
        // F | T = T
        // F | F = F
        System.out.println(56 < 90 || 676 <= 78);

        // not !
        System.out.println(45 != 78);

    }

}