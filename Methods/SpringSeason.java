import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input the month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if the date is in spring
        boolean isSpring = isSpringSeason(month, day);

        // Output the result
        if (isSpring) {
            System.out.println("The date " + month + "/" + day + " is in spring.");
        } else {
            System.out.println("The date " + month + "/" + day + " is not in spring.");
        }

        // Close the scanner
        input.close();
    }

    // Method to check if a date is in spring
    public static boolean isSpringSeason(int month, int day) {
        // Spring is from March 20 to June 20
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
}
