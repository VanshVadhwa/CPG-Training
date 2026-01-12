import java.util.Scanner;

public class BMI_Methods {

    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0; // Convert to meters
            
            if (heightM > 0) {
                double bmi = weight / (heightM * heightM);
                personData[i][2] = bmi; // Store BMI
            }
        }
    }

    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 10 rows, 3 cols (Weight, Height, BMI)

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personData[i][0] = input.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = input.nextDouble();
        }

        calculateBMI(personData);
        String[] status = getBMIStatus(personData);

        System.out.println("\nBMI Report:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Height=%.1f cm, Weight=%.1f kg, BMI=%.2f, Status=%s\n", 
                (i + 1), personData[i][1], personData[i][0], personData[i][2], status[i]);
        }
        input.close();
    }
}