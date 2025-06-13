import java.util.Scanner;
class SumNaturalWhile {
    public static void main(String[] args) {
		// craete a Scanner  object
        Scanner input = new Scanner(System.in);
        
		//Get user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
		//check whether it's a Natural number
        if (n > 0) {
		    // compute using while loop
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
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
