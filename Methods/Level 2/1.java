import java.util.Scanner;

public class NumberFactors {

    // Method to find factors and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop: Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        // Second loop: Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumSquareFactors(int[] factors) {
        double sumSquare = 0;
        for (int factor : factors) {
            sumSquare += Math.pow(factor, 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumSquareFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        
        input.close();
    }
}