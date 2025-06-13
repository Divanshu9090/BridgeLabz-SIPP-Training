import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Initialize count
        int count = 0;

        // Handle special case if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        // Display the result
        System.out.println("Number of digits: " + count);

        // Close the Scanner
        input.close();
    }
}
