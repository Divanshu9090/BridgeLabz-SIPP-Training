package Strings;

import java.util.Scanner;

public class SubstringOccurrences {
    // Method to count occurrences of a substring in a main string
    private static int countSubstringOccurrences(String mainString, String substring) {
        // Avoid counting empty substrings
        if (substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take a user input for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Take a substring input to count its occurrences
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring in the main string ans display the result
        int count = countSubstringOccurrences(mainString, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");

        // Close the Scanner
        scanner.close();
    }

}
