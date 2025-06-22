package Strings;

import java.util.Scanner;
public class CountVowelsAndConsonants {

	private static int [] countVowelsAndConsonants(String str) {
		int [] ans = {0,0};
		for(char c : str.toLowerCase().toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				ans[0]++;
			}else if(c>='a' && c<='z') {
				ans[1]++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take a user input
		String str = input.nextLine();
		
		// Calculate and Display the result
		int [] result = countVowelsAndConsonants(str);
		System.out.println("Vowels: "+ result[0]);
		System.out.println("Consonants: "+result[1]);
		
		// Close the Scanner
		input.close();
	}

}
