import java.util.Scanner;

public class UnitConvertor {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for fahrenheit to Celsius conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert and display the result
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        // Take input for Celsius to Fahrenheit conversion
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert and display the result
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        // Take input for pounds to kilograms conversion
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        // Convert and display the result
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

        // Take input for kilograms to pounds conversion
        System.out.print("Enter weight in kilograms: ");
        kilograms = input.nextDouble();

        // Convert and display the result
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is " + pounds + " pounds");

        // Take input for gallons to liters conversion
        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();

        // Convert and display the result
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is " + liters + " liters");

        // Take input for liters to gallons conversion
        System.out.print("Enter volume in liters: ");
        liters = input.nextDouble();

        // Convert and display the result
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is " + gallons + " gallons");
    }
}