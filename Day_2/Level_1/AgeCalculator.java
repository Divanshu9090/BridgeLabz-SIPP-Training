import java.util.*;
class AgeCalculator{
	public static void main(String [] args){
		//Creating variables to store name,birth year and current year
		String name = "Harry";
		int birthYear = 2000 , currentYear = 2024;
		
		// Displaying current age
		System.out.println("Harry's age in "+currentYear+" is "
			+(currentYear-birthYear));
	}
}