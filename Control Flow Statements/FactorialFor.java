import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Check number is natural
        if (n >= 0) {
            // Compute a Factorial using a for loop
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        // Close input stream
        input.close();
    }
}
