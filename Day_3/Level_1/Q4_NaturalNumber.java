import java.util.Scanner;
class Q4_NaturalNumber{
	public static void main (String [] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// get user input
		long number = input.nextLong();
		
		//check number is natural number or not 
		if(number>0){
			//find sum of n natural number and display
			long sum = number*(number+1)/2;
			System.out.println("The sum of "+number+ " natural numbers is "+sum);
		}else{
			//display number is not a natural number
			System.out.println("The number "+number+" is not a natural number");
		}
		
		//close Scanner stream
		input.close();
	}
}