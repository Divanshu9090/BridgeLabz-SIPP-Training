import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result and counter
        int result = 1;
        int counter = 0;

        // Compute power using while loop
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        // Close the Scanner
        input.close();
    }
}
