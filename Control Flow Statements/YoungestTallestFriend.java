import java.util.Scanner;

class YoungestTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Get heights
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = input.nextInt();

        // Determine the youngest
        String youngest;
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Determine the tallest
        String tallest;
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the Scanner
        input.close();
    }
}
