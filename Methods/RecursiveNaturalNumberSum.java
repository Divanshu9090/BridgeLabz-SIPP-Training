import java.util.Scanner;

public class RecursiveNaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            input.close();
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumOfNaturalNumbers(n);

        // Calculate sum using the formula
        int formulaSum = formulaSumOfNaturalNumbers(n);

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        // Compare the two results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods gives the same result.");
        } else {
            System.out.println("The results do not match.");
        }

        // Close the scanner
        input.close();
    }

    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int formulaSumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}