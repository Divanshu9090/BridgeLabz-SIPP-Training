import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Generate random scores for Physics, Chemistry, and Math
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        // Close the scanner
        input.close();
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics score (2-digit)
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry score (2-digit)
            scores[i][2] = rand.nextInt(90) + 10; // Math score (2-digit)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100; // Total marks is 300

            results[i][0] = Math.round(total * 100.0) / 100.0; // Round off to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round off to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round off to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%%\t%s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grade);
        }
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

}