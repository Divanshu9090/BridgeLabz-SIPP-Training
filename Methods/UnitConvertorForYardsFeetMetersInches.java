import java.util.Scanner;

public class UnitConvertorForYardsFeetMetersInches {

    // Methods to convert between yards, feet, meters, and inches
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for conversions and display results
        System.out.print("Enter yards to convert to feet: ");
        double yards = input.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        System.out.print("Enter feet to convert to yards: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        System.out.print("Enter meters to convert to inches: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        System.out.print("Enter inches to convert to meters: ");
        double inches = input.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        System.out.print("Enter inches to convert to centimeters: ");
        double inchesForCm = input.nextDouble();
        System.out.println(inchesForCm + " inches is " + convertInchesToCentimeters(inchesForCm) + " centimeters.");

        // Close the scanner
        input.close();
    }
}