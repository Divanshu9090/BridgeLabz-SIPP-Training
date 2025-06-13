import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Check if number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number - 1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the Scanner
        input.close();
    }
}
