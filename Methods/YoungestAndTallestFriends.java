import java.util.Scanner;

public class YoungestAndTallestFriends {

    // Method to find the index of the youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the index of the tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Arrays to hold ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age for friend " + (i + 1) + ":");
            ages[i] = input.nextInt();
            System.out.println("Enter height (in cm) for friend " + (i + 1) + ":");
            heights[i] = input.nextDouble();
        }

        // Find the youngest and tallest friends
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("\nYoungest Friend: Friend " + (youngestIndex + 1) + " with age " + ages[youngestIndex]);
        System.out.println(
                "Tallest Friend: Friend " + (tallestIndex + 1) + " with height " + heights[tallestIndex] + " cm");

        // Close the scanner
        input.close();
    }
}