/*
 * COS 201 - Computer Programming I
 * Week 3 - Practical 2: Student Average Calculator
 *
 * Asks for a student's name, reads three course scores,
 * then calculates and displays the total and the average.
 *
 * Extension exercise: each score is checked to be between
 * 0 and 100 before the result is calculated.
 */

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read keyboard input
        Scanner input = new Scanner(System.in);

        // Valid range for a score
        final double MIN_SCORE = 0.0;
        final double MAX_SCORE = 100.0;

        // Read the student's name and three scores
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Check that every score is between 0 and 100
        boolean score1Valid = score1 >= MIN_SCORE && score1 <= MAX_SCORE;
        boolean score2Valid = score2 >= MIN_SCORE && score2 <= MAX_SCORE;
        boolean score3Valid = score3 >= MIN_SCORE && score3 <= MAX_SCORE;

        if (score1Valid && score2Valid && score3Valid) {
            // Calculate the total and the average
            double total = score1 + score2 + score3;
            double average = total / 3.0;

            // Display the result
            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Student: " + name);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("\nInvalid input: each score must be between 0 and 100.");
            System.out.println("Please run the program again with valid scores.");
        }

        input.close();
    }
}
