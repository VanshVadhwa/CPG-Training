import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        // Arrays for marks, percentages, and grades
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentage = new double[numStudents];
        String[] grade = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Physics Marks: ");
            physics[i] = input.nextDouble();
            
            System.out.print("Chemistry Marks: ");
            chemistry[i] = input.nextDouble();
            
            System.out.print("Maths Marks: ");
            maths[i] = input.nextDouble();

            // Validate inputs (Basic check for negative)
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrement index to retry
                continue;
            }

            // Calculate Percentage (Assuming total marks per subject is 100)
            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300) * 100;

            // Determine Grade based on table
            if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else if (percentage[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        // Display Results
        System.out.println("\nPhy\tChem\tMath\t%\tGrade");
        System.out.println("---------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%.0f\t%.0f\t%.0f\t%.2f\t%s\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        input.close();
    }
}