import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is natural
        if (n > 0) {
            // Print Odd or Even numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a natural number.");
        }

        // Close input stream
        input.close();
    }
}
