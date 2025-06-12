import java.util.Scanner;
class Q5_CanPersonVote{
	public static void main (String [] args){
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//get user age
		int age = input.nextInt();
		
		//check age is above 18 or not and display vote or not
		if(age >=18 ){
			System.out.println("The person can vote.");
		}else{
			System.out.println("The person cannot vote.");
		}

		//close Scanner stream
		input.close();
	}
}