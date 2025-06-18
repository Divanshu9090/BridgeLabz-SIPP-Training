import java.util.Scanner;

public class NumberAnalysis {

    // Methods to analyze numbers is positive or negative.
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers and return 1, -1, or 0.
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Create an array to hold 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze each and display results
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive");
                if (isEven(number)) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        // Compare first and last elements
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        int comparisonResult = compare(firstElement, lastElement);

        // Display comparison result
        if (comparisonResult > 0) {
            System.out.println(
                    "The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else if (comparisonResult < 0) {
            System.out.println(
                    "The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        } else {
            System.out.println(
                    "The first element (" + firstElement + ") is equal to the last element (" + lastElement + ").");
        }

        // Close the scanner
        input.close();
    }
}