import java.util.Scanner;

public class CompareStringsUsingCharAt {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are of different lengths
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters at position i are different
            }
        }
        return true; // All characters match
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String firstString = input.next();
        System.out.print("Enter second string: ");
        String secondString = input.next();

        // Compare using custom method
        boolean areEqualUsingCharAt = compareStrings(firstString, secondString);

        // Check using built-in equals() method
        boolean areEqualUsingBuiltIn = firstString.equals(secondString);

        // Display results
        System.out.println("\nComparison using charAt(): " + areEqualUsingCharAt);
        System.out.println("Comparison using built-in equals(): " + areEqualUsingBuiltIn);

        // Close the scanner
        input.close();
    }
}