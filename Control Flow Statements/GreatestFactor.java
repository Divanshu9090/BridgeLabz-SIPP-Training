import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive number greater than 1
        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1;

            // Loop to find the greatest factor (excluding the number itself)
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // exit loop after finding the first (greatest) factor
                }
                counter--;
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        // Close input stream
        input.close();
    }
}
