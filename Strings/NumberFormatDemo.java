import java.util.Scanner;

public class NumberFormatDemo {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter any text: ");
        String str = input.nextLine();

        // Call method to generate NumberFormatException
        generateException(str);

        // Call method to handle NumberFormatException using try-catch
        handleException(str);

        // Close the scanner
        input.close();
    }

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}