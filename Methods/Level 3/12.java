import java.util.Scanner;

public class StudentScorecard {

    public static double[][] generateScores(int n) {
        double[][] scores = new double[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) scores[i][j] = 50 + (Math.random() * 50); // 50-99
        }
        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // Total, Avg, %
        for(int i=0; i<n; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            results[i][0] = total;
            results[i][1] = Math.round((total / 3) * 100.0) / 100.0;
            results[i][2] = Math.round((total / 300 * 100) * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(double[][] scores, double[][] results) {
        System.out.println("Std\tPhy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        System.out.println("--------------------------------------------------------------");
        for(int i=0; i<scores.length; i++) {
            System.out.printf("%d\t%.0f\t%.0f\t%.0f\t%.0f\t%.2f\t%.2f\t", 
                (i+1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
            
            double p = results[i][2];
            if(p >= 80) System.out.println("A");
            else if(p >= 70) System.out.println("B");
            else if(p >= 60) System.out.println("C");
            else if(p >= 50) System.out.println("D");
            else if(p >= 40) System.out.println("E");
            else System.out.println("R");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        double[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        sc.close();
    }
}