import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] data) {
        String[][] report = new String[data.length][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // Convert to meters
            
            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            report[i][0] = String.valueOf(heightCm);
            report[i][1] = String.valueOf(weight);
            report[i][2] = String.format("%.2f", bmi);
            report[i][3] = status;
        }
        return report;
    }

    public static void displayReport(String[][] report) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");
        for (String[] row : report) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // 10 rows, 2 cols (Weight, Height)

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = calculateBMI(data);
        displayReport(bmiReport);
        sc.close();
    }
}