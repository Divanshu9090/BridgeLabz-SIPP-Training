package Strings;

import java.util.Scanner;

public class LongestWord {
    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take a user input
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine().trim();

        // Find the longest word and display the result
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);

        // Close the Scanner
        input.close();
    }
}
