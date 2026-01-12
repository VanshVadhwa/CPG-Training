import java.util.Scanner;

public class BMI_2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D Array to store Weight, Height, and BMI
        // Rows = number of persons
        // Cols = 3 (0: Weight, 1: Height, 2: BMI)
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Validate input for positive values
            double w, h;
            do {
                System.out.print("Enter Weight (kg): ");
                w = input.nextDouble();
                if (w <= 0) System.out.println("Invalid weight. Try again.");
            } while (w <= 0);
            
            do {
                System.out.print("Enter Height (m): ");
                h = input.nextDouble();
                if (h <= 0) System.out.println("Invalid height. Try again.");
            } while (h <= 0);

            // Store in 2D array
            personData[i][0] = w; // Weight at column 0
            personData[i][1] = h; // Height at column 1

            // Calculate BMI and store at column 2
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine status
            double currentBMI = personData[i][2];
            if (currentBMI <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (currentBMI >= 18.5 && currentBMI <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (currentBMI >= 25.0 && currentBMI <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        System.out.println("----------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        input.close();
    }
}