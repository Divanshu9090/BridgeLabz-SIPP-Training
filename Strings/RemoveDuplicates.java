package Strings;

import java.util.Scanner;

public class RemoveDuplicates {
	// Method to remove duplicates from a string
	public static String removeDuplicates(String str) {
		// Create a StringBuilder to store the result
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (result.indexOf(String.valueOf(currentChar)) == -1) {
				result.append(currentChar);
			}
		}

		return result.toString();
	}

	// Main Method
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take a user input
		String str = input.nextLine();

		// remove duplicates and display the result
		String result = removeDuplicates(str);
		System.out.println("String after removing duplicates: " + result);

		// close the Scanner
		input.close();
	}
}