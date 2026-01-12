import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to find sum using loop
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SumNaturalNumbers program = new SumNaturalNumbers();

        System.out.print("Enter a natural number n: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = program.calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is " + sum);
        }
        
        input.close();
    }
}