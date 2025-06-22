package Strings;

import java.util.Scanner;
public class Palindrome {
	// Method to check String is Palindrome or not.
	private static boolean checkPalindrome(String str) {
		int l=0,r=str.length()-1;
		while(l<r) {
			if(str.charAt(r)!=str.charAt(l)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	// Main Method
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Take a user input
		String str = input.nextLine();
		
		//  check String is palindrome or not and Display it;
		boolean res = checkPalindrome(str);
		if(res) {
			System.out.println(str +" is Palindrome!");
		}else{
			System.out.println(str + " is not a Palindrome.");
		}
		
		// close the Scanner
		input.close();
	}
}
