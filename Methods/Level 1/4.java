import java.util.Scanner;

public class TriangularPark {

    // Method to calculate rounds needed
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double targetDistance = 5000; // 5km in meters
        return targetDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TriangularPark program = new TriangularPark();

        System.out.println("Enter the three sides of the triangular park (in meters):");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        double rounds = program.calculateRounds(s1, s2, s3);
        
        // Using Math.ceil to ensure they complete the full distance
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds.");
        
        input.close();
    }
}