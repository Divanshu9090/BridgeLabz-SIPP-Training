import java.util.Random;
import java.util.Arrays;
public class FootballTeamHeight {

    public static void main(String[] args) {
        // Create an array to hold the heights of the players
        int[] heights = new int[11];
        Random random = new Random();

        // Fill the array with random heights between 150 and 250 cms
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Generates a number between 150 and 250
        }

        // Print the heights of the players
        System.out.println("Heights of players: " + Arrays.toString(heights));

        // Calculate and print the sum, mean, shortest, and tallest heights
        System.out.println("Sum of heights: " + sumOfHeights(heights));
        System.out.println("Mean height: " + meanHeight(heights));
        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
    }

    // Method to find the sum of all elements in the array
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    // Method to find the shortest height of the players
    public static int shortestHeight(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height of the players
    public static int tallestHeight(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}