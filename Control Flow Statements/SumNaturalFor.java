import java.util.Scanner;
class SumNaturalFor {
    public static void main(String[] args) {
		// create a Scanner object
        Scanner input = new Scanner(System.in);
		
        //Get user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
		//check whether it's a Natural number
        if (n > 0) {
		
			// Compute using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
			
			//Compute using formula
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("Please enter a natural number.");
        }
        
		//close input stream
        input.close();
    }
}
