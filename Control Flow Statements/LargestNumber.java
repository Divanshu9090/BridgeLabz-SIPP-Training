import java.util.Scanner;
class LargestNumber{
	public static void main(String [] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get 3 input values  number1, number2, number3
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//check  largest number and display the result
		System.out.println("Is the first number the largest? " + (number1>number2 && number1 >number3) +
			"\nIs the second number the largest? " + (number2>number1 && number2>number3) +
			"\nIs the third number the largest? "+ (number3>number1 && number3>number1));
		
		//close Scanner stream
		input.close();
	}
}