import java.util.Random;

public class ZaraBonusCalculator {

    public static void main(String[] args) {
        // Generate random employee data
        int[][] employeeData = generateEmployeeData(10);
        // Calculate new salaries and bonuses
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);
        // Display the results
        displayResults(employeeData, updatedData);
    }

    // Generates random employee data
    private static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] data = new int[numberOfEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numberOfEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // 5-digit salary
            data[i][1] = random.nextInt(21); // years of service between 0 and 20
        }
        return data;
    }

    // Calculates new salaries and bonuses based on the old salary and years of
    // service
    private static double[][] calculateNewSalariesAndBonuses(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [old salary, new salary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusRate = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    private static void displayResults(int[][] employeeData, double[][] updatedData) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus");
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Display each employee's data
        for (int i = 0; i < employeeData.length; i++) {
            int empId = i + 1;
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f%n", empId, oldSalary, yearsOfService, newSalary,
                    bonus);
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        System.out.printf("%-10s %-10.2f %-10s %-10.2f %-10.2f%n", "Total", totalOldSalary, "", totalNewSalary,
                totalBonus);
    }
}