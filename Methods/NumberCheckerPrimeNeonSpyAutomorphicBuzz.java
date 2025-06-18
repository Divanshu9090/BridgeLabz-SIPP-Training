import java.util.Scanner;

public class NumberCheckerPrimeNeonSpyAutomorphicBuzz {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check various properties of the number
        System.out.println("Is prime number: " + isPrime(number));
        System.out.println("Is neon number: " + isNeonNumber(number));
        System.out.println("Is spy number: " + isSpyNumber(number));
        System.out.println("Is automorphic number: " + isAutomorphicNumber(number));
        System.out.println("Is buzz number: " + isBuzzNumber(number));

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;

        String strNumber = String.valueOf(number);
        String strSquare = String.valueOf(square);

        return strSquare.endsWith(strNumber);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || String.valueOf(number).endsWith("7"));
    }
}