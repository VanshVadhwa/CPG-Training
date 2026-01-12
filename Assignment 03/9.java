import java.util.Scanner;

public class StudentGrades_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        // 2D Array for Marks: [Row=Student][Col=Subject]
        // Col 0: Physics, Col 1: Chemistry, Col 2: Maths
        double[][] marks = new double[numStudents][3];
        
        double[] percentage = new double[numStudents];
        String[] grade = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            // Loop for 3 subjects
            for (int j = 0; j < 3; j++) {
                String subjectName = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter " + subjectName + " Marks: ");
                double m = input.nextDouble();
                
                if (m < 0) {
                    System.out.println("Negative marks not allowed. Retry.");
                    j--; // Retry this subject
                } else {
                    marks[i][j] = m;
                }
            }

            // Calculate Percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            // Determine Grade
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
            System.out.printf("%.0f\t%.0f\t%.0f\t%.2f\t%s\n", marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        input.close();
    }
}