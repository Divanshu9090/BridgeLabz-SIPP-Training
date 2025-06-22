package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    // Method to find the most frequent character in a string
    private static char findMostFrequentCharacter(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum frequency
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = 1;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and display the most frequent character
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");

        // Close the Scanner
        scanner.close();
    }
}