import java.util.Scanner;

public class CheckAbundantNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create a variable to hold the sum of divisors
        int sum = 0;

        // Find the sum of all proper divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the number is an Abundant Number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close Scanner
        input.close();
    }
}
