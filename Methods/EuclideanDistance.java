import java.util.Scanner;

public class EuclideanDistance {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate Euclidean distance and display it
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate equation of the line and display it
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        // Close the scanner
        input.close();
    }

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line in slope-intercept form
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[] { slope, intercept };
    }
}