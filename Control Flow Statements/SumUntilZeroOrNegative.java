import java.util.Scanner;
class SumUntilZeroOrNegative {
    public static void main(String[] args) {
		// create a Scanner object
        Scanner input = new Scanner(System.in);
        
		// create a variable for total
        double total = 0.0;
        
		//run a loop
        while (true) {
		
			//Get user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();
			
			//check until user enter 0 or negative number
            if (number <= 0) {
                break;
            }
            total += number;
        }
        
		//Display the total
        System.out.println("Total sum: " + total);
		
		//close input stream
        input.close();
    }
}
