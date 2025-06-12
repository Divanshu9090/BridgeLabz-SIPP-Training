import java.util.Scanner;
class Q2_SmallestNumber{
	public static void main(String [] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get 3 input values  number1, number2, number3
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//check  first number the smallest and display the result
		boolean result = (number1<number2)&& (number1<number3);
		System.out.println("Is the first number the smallest? "+ result);
		
		//close Scanner stream
		input.close();
	}
}