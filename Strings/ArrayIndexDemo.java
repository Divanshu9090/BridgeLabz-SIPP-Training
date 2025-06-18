import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number of names: ");
        int n = input.nextInt();
        input.nextLine(); // Consume newline

        //Create an array of names
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        //Call method to generate the exception
        generateException(names);

        //Call method to handle the exception using try-catch
        handleException(names);

        // Close the scanner
        input.close();
    }

    //Generate runtime exception by accessing invalid index
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    //Handle exception using try-catch block
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}