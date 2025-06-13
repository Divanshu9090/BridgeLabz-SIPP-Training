import java.util.Scanner;
class CheckItsSpringSeason{
	public static void main (String [] args){
		//create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter a month: ");
		String month = input.nextLine();
		System.out.print("Enter a day: ");
		int day = input.nextInt();
		
		//check number Its a Spring Season or not and display
		if(month.toLowerCase().equals("march") && day >=20){
			System.out.println("Its a Spring Season");
		} else if (month.toLowerCase().equals("june") && day <=20){
			System.out.println("Its a Spring Season");
		} else if (month.toLowerCase().equals("may") ) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
		
		//close Scanner stream
		input.close();
	}
}