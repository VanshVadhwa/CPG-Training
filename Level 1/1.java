import java.util.Scanner;

public class SimpleInterest {
    
    // Method to calculate simple interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleInterest program = new SimpleInterest();

        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double interest = program.calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
        
        input.close();
    }
}