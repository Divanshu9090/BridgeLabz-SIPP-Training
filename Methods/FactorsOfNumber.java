import java.util.Scanner;
import java.util.Arrays;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Find factors of the number
        int[] factors = findFactors(n);

        // Output the factors
        System.out.println("Factors of " + n + ": " + Arrays.toString(factors));

        // Calculate and output various properties of the factors
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

        // Close the scanner
        input.close();
    }

    // Method to find factors of a number
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Methods to calculate properties of factors
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // Last element is the greatest factor
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1.0;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}