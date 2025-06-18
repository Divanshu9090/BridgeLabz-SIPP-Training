import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        String substring = text.substring(start, end);
        System.out.println("Substring: " + substring);
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text, int start, int end) {
        try {
            String substring = text.substring(start, end);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for a string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Define start and end indices
        System.out.print("Enter start index: ");
        int startIndex = input.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = input.nextInt();

        // Call method to generate the exception
        generateException(inputString, startIndex, endIndex);

        // Call method to handle the exception using try-catch
        handleException(inputString, startIndex, endIndex);

        input.close();
    }
}