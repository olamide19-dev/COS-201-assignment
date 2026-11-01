/*
 * COS 201 - Computer Programming I
 * Week 2 - Practice exercise: Using print() and println()
 *
 * print() stays on the same line; println() moves to a new line after printing.
 * Predicted output:
 *     COS 201
 *     Java
 */

public class PrintExample {

    public static void main(String[] args) {
        System.out.print("COS ");     // no new line, so "201" follows on the same line
        System.out.println("201");    // ends the first line
        System.out.println("Java");
    }
}
