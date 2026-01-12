import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define constants to avoid hard coding [cite: 6]
        final int NUM_EMPLOYEES = 10;
        final double BONUS_HIGH = 0.05;
        final double BONUS_LOW = 0.02;
        final int YEARS_THRESHOLD = 5;

        // arrays to store salary and years of service [cite: 119]
        double[] salary = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        
        // arrays to store new salary and bonus amount [cite: 120]
        double[] newSalary = new double[NUM_EMPLOYEES];
        double[] bonusAmount = new double[NUM_EMPLOYEES];

        // variables for totals [cite: 120]
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input [cite: 121]
        System.out.println("Enter details for " + NUM_EMPLOYEES + " employees:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            
            System.out.print("Enter Salary: ");
            double sal = input.nextDouble();
            
            System.out.print("Enter Years of Service: ");
            double years = input.nextDouble();

            // Validate inputs: if invalid, decrement index to ask again [cite: 122, 123]
            if (sal <= 0 || years < 0) {
                System.err.println("Invalid input. Salary must be > 0 and years >= 0.");
                i--; // decrement to retry this iteration
                continue;
            }
            
            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Loop to calculate bonus and new salary [cite: 124]
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            // Determine bonus percentage
            if (yearsOfService[i] > YEARS_THRESHOLD) {
                bonusAmount[i] = salary[i] * BONUS_HIGH;
            } else {
                bonusAmount[i] = salary[i] * BONUS_LOW;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonusAmount[i];

            // Update totals [cite: 126]
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results [cite: 127]
        System.out.println("\n--- Summary ---");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        input.close();
    }
}