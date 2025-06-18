public class RandomNumberStats {

    public static void main(String[] args) {
        int size = 5; // Number of random values to generate

        // Generate an array of 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Calculate average, minimum, and maximum
        double[] stats = findAverageMinMax(randomNumbers);
        double average = stats[0];
        int min = (int) stats[1];
        int max = (int) stats[2];

        // Print the results
        System.out.println("Generated Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        // Create an array of the specified size
        int[] numbers = new int[size];

        // Fill the array with random 4-digit numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); // Generates a 4-digit number
        }

        // Return the populated array
        return numbers;
    }

    // Method to find the average, minimum, and maximum of an array of integers
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Iterate through the array to calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // Calculate the average and return it along with min and max
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }
}