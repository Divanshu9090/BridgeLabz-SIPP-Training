import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Create a 2D array to hold weight, height, and BMI for 10 persons
        double[][] persons = new double[10][3];

        // Input weight and height for each person
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            persons[i][0] = input.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            persons[i][1] = input.nextDouble();
            // Calculate BMI and store it in the third column
            persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
        }

        // Display the results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < persons.length; i++) {
            String status = determineStatus(persons[i][2]);
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + persons[i][0] + " kg");
            System.out.println("Height: " + persons[i][1] + " m");
            System.out.println("BMI: " + persons[i][2]);
            System.out.println("Weight Status: " + status);
            System.out.println();
        }

        // Close the scanner
        input.close();
    }
}