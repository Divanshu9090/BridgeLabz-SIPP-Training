import java.util.Scanner;
class SumNatural{
	public static void main (String [] args){
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get user input
		int n = input.nextInt();
		
		//check number is natural or not
		if(n>=0){
			//Compute sum
			long sum = n*(n+1)/2;
			
			System.out.println("The sum of "+n+" natural numbers is " + sum);
		} else {
			System.out.println("The number "+n+" is not a natural number");
		}
		
		//close Scanner stream
		input.close();
	}
}