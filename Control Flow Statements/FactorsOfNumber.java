import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number - 1
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner
        input.close();
    }
}
