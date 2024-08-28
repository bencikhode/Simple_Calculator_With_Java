package com.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display available operations to the user
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Prompt user to select an operation
        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scanner.nextInt(); // Read the user's choice

        // Prompt user to enter the number of values to calculate
        System.out.print("Enter number of values to calculate: ");
        int count = scanner.nextInt(); // Read the number of values

        // Validate that at least two values are required for calculation
        if (count < 2) {
            System.out.println("At least two values are required.");
            return; // Exit the program if fewer than two values are provided
        }

        // Create an array to store the values
        double[] numbers = new double[count];
        System.out.println("Enter the values:");

        // Read the user inputs into the array
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextDouble(); // Read each value into the array
        }

        // Initialize result with the first value in the array
        double result = numbers[0];
        boolean validChoice = true; // Flag to check if the operation was valid

        // Perform the selected operation on the values
        for (int i = 1; i < count; i++) {
            switch (choice) {
                case 1: // Addition
                    result += numbers[i]; // Add the current value to result
                    break;
                case 2: // Subtraction
                    result -= numbers[i]; // Subtract the current value from result
                    break;
                case 3: // Multiplication
                    result *= numbers[i]; // Multiply the current value with result
                    break;
                case 4: // Division
                    // Check for division by zero
                    if (numbers[i] != 0) {
                        result /= numbers[i]; // Divide the result by the current value
                    } else {
                        System.out.println("Error: Division by zero"); // Print error message
                        validChoice = false; // Set flag to false due to error
                    }
                    break;
                default:
                    System.out.println("Invalid choice"); // Print error message for invalid choice
                    validChoice = false; // Set flag to false due to invalid choice
                    break;
            }
        }

        // Print the result if the choice was valid
        if (validChoice) {
            System.out.println("Result: " + result); // Display the result
        }

        // Close the Scanner object
        scanner.close();
    }
}
