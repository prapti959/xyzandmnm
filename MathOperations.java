
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division
        System.out.println("a % b = " + (a % b));   // Modulus

        // 2. Unary Operators
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));  // Post-increment
        System.out.println("++x = " + (++x));  // Pre-increment
        System.out.println("x-- = " + (x--));  // Post-decrement
        System.out.println("--x = " + (--x));  // Pre-decrement

        // 3. Assignment Operators
        int y = 20;
        System.out.println("\nAssignment Operators:");
        System.out.println("y = " + y);
        

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 5. Logical Operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        // 6. Ternary Operator
        int num = -15;
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println("\nTernary Operator:");
        System.out.println("num is " + result);
    }

}