import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Create arrays to store weight, height, BMI, and status
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Loop to take input and calculate BMI
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            System.out.print("Enter Weight (kg): ");
            weights[i] = input.nextDouble();
            
            System.out.print("Enter Height (m): "); // Assuming height in meters for standard BMI formula
            heights[i] = input.nextDouble();

            // Calculate BMI: weight / (height * height)
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine Weight Status based on table
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        System.out.println("----------------------------------------");
        for (int i = 0; i < number; i++) {
            // Using printf for cleaner formatting of double values
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmi[i], weightStatus[i]);
        }

        input.close();
    }
}