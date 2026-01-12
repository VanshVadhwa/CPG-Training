import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        double[][] empData = new double[10][2]; // Salary, Years
        double[][] newData = new double[10][2]; // New Salary, Bonus
        
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        Random rand = new Random();

        System.out.println("ID\tOld Salary\tYears\tBonus\tNew Salary");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            // Generate Data
            empData[i][0] = 10000 + rand.nextInt(90000); // Salary 10k-99k
            empData[i][1] = rand.nextInt(15); // 0-14 years

            // Calculate Bonus
            double bonusRate = (empData[i][1] > 5) ? 0.05 : 0.02;
            double bonus = empData[i][0] * bonusRate;
            double newSalary = empData[i][0] + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;

            totalOldSalary += empData[i][0];
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", 
                (i+1), empData[i][0], empData[i][1], bonus, newSalary);
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }
}