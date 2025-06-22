package Strings;

import java.util.Scanner;

public class CompareStrings {
    // Method to compare two strings lexicographically
    public static String compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
            }
        }

        // If all characters are equal up to the length of the shorter string
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (str1.length() > str2.length()) {
            return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
        } else {
            return "Both strings are equal";
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Take user input for the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare the strings and display the result
        String result = compareStrings(string1, string2);
        System.out.println(result);

        // Close the Scanner
        scanner.close();
    }
}