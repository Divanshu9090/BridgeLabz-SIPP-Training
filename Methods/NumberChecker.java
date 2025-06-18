import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Perform various operations
        int digitCount = countDigits(number);
        int[] digitsArray = storeDigits(number);
        int sumOfDigits = sumOfDigits(digitsArray);
        int sumOfSquares = sumOfSquaresOfDigits(digitsArray);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequency = digitFrequency(digitsArray);

        // Display the results
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad number: " + isHarshad);

        System.out.println("Digit Frequencies:");
        for (int[] freq : frequency) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }

        // Close the scanner
        input.close();
    }

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of a number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digits;
    }

    // Method to calculate the sum of digits in an array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate the sum of squares of digits in an array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to calculate the frequency of each digit (0-9) in an array of digits
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 possible digits (0-9)

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // frequency
        }
        for (int digit : digits) {
            frequency[digit][1]++; // increment frequency for the digit
        }
        return frequency;
    }
}