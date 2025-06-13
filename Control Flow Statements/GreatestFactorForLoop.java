import java.util.Scanner;

class GreatestFactorForLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if input is valid
        if (number > 1) {
            int greatestFactor = 1;

            // Loop from (number - 1) down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Stop at the first (greatest) factor found
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        // Close the Scanner
        input.close();
    }
}
