import java.util.Scanner;

public class CheckHarshadNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Save original number
        int original = number;

        // Initialize sum of digits
        int sum = 0;

        // Loop to calculate sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is Not a Harshad Number.");
        }

        // Close Scanner
        input.close();
    }
}