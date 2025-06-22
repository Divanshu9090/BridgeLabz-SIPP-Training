package Strings;

import java.util.Scanner;

public class ToggleCase {
    // Method to toggle the case of each character in a string
    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); // Non-alphabetic characters remain unchanged
            }
        }

        return toggledString.toString();
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle the case of the string and display the result
        String toggled = toggleCase(input);
        System.out.println("Toggled case: " + toggled);

        // Close the Scanner
        scanner.close();
    }
}
