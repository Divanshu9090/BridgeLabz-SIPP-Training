package Strings;

import java.util.Scanner;

public class RemoveCharacter {
    // Method to remove all occurrences of a specific character from a string
    private static String removeCharacter(String inputString, char characterToRemove) {
        // Create a StringBuilder to build the modified string
        StringBuilder modifiedString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (c != characterToRemove) {
                modifiedString.append(c);
            }
        }

        return modifiedString.toString();
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Take user input for the character to remove
        System.out.print("Enter the character to remove: ");
        char characterToRemove = scanner.next().charAt(0);

        // Remove the specified character and display the result
        String result = removeCharacter(inputString, characterToRemove);
        System.out.println("Modified String: \"" + result + "\"");

        // Close the Scanner
        scanner.close();
    }
}