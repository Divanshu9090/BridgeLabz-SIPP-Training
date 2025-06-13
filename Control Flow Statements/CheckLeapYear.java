import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Check for valid Gregorian calendar year
        if (year >= 1582) {
            // Check Leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid input. Year must be 1582 or later.");
        }

        // Close the Scanner
        input.close();
    }
}