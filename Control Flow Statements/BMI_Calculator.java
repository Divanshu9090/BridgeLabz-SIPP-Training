import java.util.Scanner;

class BMI_Calculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input for weight and height
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        // Close the Scanner
        input.close();
    }
}
