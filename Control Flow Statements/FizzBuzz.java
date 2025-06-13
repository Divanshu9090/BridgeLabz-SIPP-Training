import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive number
        if (number > 0) {
            // Loop from 1 to the input number
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
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
