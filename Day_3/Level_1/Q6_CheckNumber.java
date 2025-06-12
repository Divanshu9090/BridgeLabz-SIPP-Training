import java.util.Scanner;
class Q6_CheckNumber{
	public static void main (String [] args){
		//create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//get user input
		int number = input.nextInt();
		
		//check number  is positive, negative, or zero and display
		if(number==0){
			System.out.println(number+" is zero.");
		} else if (number>0){
			System.out.println(number+" is positive.");
		} else {
			System.out.println(number+" is negative.");
		}
		
		//close Scanner stream
		input.close();
	}
}