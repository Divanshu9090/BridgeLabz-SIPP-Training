import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) && ((y3 - y2) * (x3 - x1) == (y3 - y1) * (x3 - x2));
    }

    // Method to check if three points are collinear using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input for three points
        System.out.print("Enter coordinates for point A (x1 y1): ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter coordinates for point B (x2 y2): ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter coordinates for point C (x3 y3): ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check collinearity using slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by slope method? " + collinearBySlope);

        // Check collinearity using area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by area method? " + collinearByArea);

        // Close the scanner
        input.close();
    }
}