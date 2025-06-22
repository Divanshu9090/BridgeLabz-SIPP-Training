package Strings;

import java.util.Scanner;
public class Reverse {
	// Method to reverse a String
	private static String reverseString(String str) {
		// Create a StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	// Main Method
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Take a user input
		String str = input.nextLine();
		
		//  Reverse String and Display it;
		String reverse = reverseString(str);
		System.out.println(reverse);
		
		// close the Scanner
		input.close();
	}

}
