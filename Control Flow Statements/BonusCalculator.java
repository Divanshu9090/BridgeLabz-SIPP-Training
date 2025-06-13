import java.util.Scanner;

class BonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input for salary and years of service
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your years of service: ");
        int years = input.nextInt();

        // Check if the years of service is greater than 5
        if (years > 5) {
            // Calculate bonus as 5% of salary
            double bonus = 0.05 * salary;
            System.out.println("You are eligible for a bonus of: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }

        // Close input stream
        input.close();
    }
}
