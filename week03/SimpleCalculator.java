/*
 * COS 201 - Computer Programming I
 * Week 3 - Practical 1: Simple Calculator
 *
 * Reads two numbers from the keyboard and calculates their
 * sum, difference, product and quotient. The quotient is only
 * calculated when the second number (the divisor) is not zero.
 */

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read keyboard input
        Scanner input = new Scanner(System.in);

        // Read the two numbers as double values
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Calculate the arithmetic results
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display the results to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Check the divisor before dividing
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Division is undefined for a zero divisor.");
        }

        input.close();
    }
}
