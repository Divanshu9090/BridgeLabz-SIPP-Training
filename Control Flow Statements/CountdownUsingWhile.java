import java.util.Scanner;
class CountdownUsingWhile{
	public static void main (String [] args){
		//create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//get user input
		int countdown = input.nextInt();
		
		//Perform countdown using while loop
		int stop =1;
		while(countdown>=stop){
			System.out.print( countdown +" ");
			//decrement counter
			countdown--;
		}
		
		//close Scanner stream
		input.close();
	}
}