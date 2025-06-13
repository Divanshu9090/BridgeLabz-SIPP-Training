import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
		//create a Scanner object
        Scanner input = new Scanner(System.in);
        
		//create a variables
        double total = 0.0;
        double number;
        
		//Get a user input
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();
        
		// check if the user entered is 0
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }
        
		//print total sum
        System.out.println("Total sum: " + total);
		
		//close Scanner stream
        input.close();
    }
}
