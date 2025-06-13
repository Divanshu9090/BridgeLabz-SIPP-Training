import java.util.Scanner;

class FindFactors {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive number
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            int counter = 1;

            // Loop to find factors
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner
        input.close();
    }
}
