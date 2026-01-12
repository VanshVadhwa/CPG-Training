import java.util.Scanner;

public class GeometryUtils {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return new double[]{m, b};
    }

    public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        // Using tolerance for double comparison
        return Math.abs(slopeAB - slopeBC) < 0.0001 && Math.abs(slopeBC - slopeAC) < 0.0001;
    }
    
    public static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 0.0001;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point 1 (x1 y1):");
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        System.out.println("Enter Point 2 (x2 y2):");
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        
        System.out.println("Distance: " + calculateDistance(x1, y1, x2, y2));
        double[] eq = lineEquation(x1, y1, x2, y2);
        System.out.println("Line Eq: y = " + eq[0] + "x + " + eq[1]);
        
        System.out.println("Enter Point 3 (x3 y3) to check collinearity:");
        double x3 = sc.nextDouble(); double y3 = sc.nextDouble();
        
        if (isCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The three points are Collinear.");
        } else {
            System.out.println("The three points are NOT Collinear.");
        }
        sc.close();
    }
}