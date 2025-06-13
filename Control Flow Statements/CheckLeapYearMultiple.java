import java.util.Scanner;

public class CheckLeapYearMultiple {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get year input
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check year validity
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
        } else {
            // Check Leap Year conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is Not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }

        // Close Scanner
        input.close();
    }
}
