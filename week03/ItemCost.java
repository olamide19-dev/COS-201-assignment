/*
 * COS 201 - Computer Programming I
 * Week 3 - Practical 3: Calculating the Total Cost of Items
 *
 * Reads an item's name, the quantity bought and the unit price,
 * then calculates the total cost:
 *
 *     total cost = quantity x unit price
 */

import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        // Create a Scanner object to read keyboard input
        Scanner input = new Scanner(System.in);

        // Read the item details
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Quantity must be positive and price cannot be negative
        if (quantity > 0 && unitPrice >= 0) {
            // Calculate the total cost
            double totalCost = quantity * unitPrice;

            // Display the purchase summary
            System.out.println("\n--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        } else {
            System.out.println("\nInvalid input: quantity must be greater than 0 "
                    + "and unit price cannot be negative.");
        }

        input.close();
    }
}
