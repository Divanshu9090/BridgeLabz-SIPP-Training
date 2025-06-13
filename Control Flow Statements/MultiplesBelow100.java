import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if number is valid
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = number;

            // Loop to find multiples
            while (counter < 100) {
                System.out.println(counter);
                counter += number;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        // Close the Scanner
        input.close();
    }
}
