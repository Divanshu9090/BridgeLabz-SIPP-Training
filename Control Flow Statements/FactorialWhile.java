import java.util.Scanner;
class FactorialWhile {
    public static void main(String[] args) {
		//create a Scanner object
        Scanner input = new Scanner(System.in);
        
		//Get user input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
     
		//Check number is positive
        if (n >= 0) {
			// Compute a Factorial
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
        
		//close input stream
        input.close();
    }
}
