import java.util.Scanner;

class Q28_PowerOfNumberForLoop {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result
        int result = 1;

        // Compute power using for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);

        // Close the Scanner
        input.close();
    }
}
