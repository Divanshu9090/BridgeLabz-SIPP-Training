package Strings;

import java.util.Scanner;

public class ReplaceWord {
    // Method to replace a word in a sentence
    private static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace the old word with the new word in the sentence
        return sentence.replace(oldWord, newWord);
    }

    // Main Method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word and display the result
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + updatedSentence);

        // Close the scanner
        scanner.close();
    }
}
