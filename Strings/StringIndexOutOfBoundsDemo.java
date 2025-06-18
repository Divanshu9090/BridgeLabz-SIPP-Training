import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        char ch = str.charAt(str.length());
        System.out.println("Character at index: " + ch);
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String str) {
        try {
            char ch = str.charAt(str.length());
            System.out.println("Character at index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for a string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Call method to generate the exception
        generateException(inputString);

        // Call method to handle the exception using try-catch
        handleException(inputString);

        // Close the scanner
        input.close();
    }
}