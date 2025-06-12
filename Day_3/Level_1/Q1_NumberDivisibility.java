import java.util.Scanner;
class Q1_NumberDivisibility{
	public static void main(String [] args){
		//create a Scanner object 
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		
		int number = input.nextInt();
		
		//check number is divisible by 5 and display true or false
		System.out.println(" Is the number "+number+" divisible by 5? "+(number%5==0));
		
		//close Scanner stream
		input.close();
	}
}