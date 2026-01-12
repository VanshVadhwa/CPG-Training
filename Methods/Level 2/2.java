import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number.");
            System.exit(0);
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Computations differ.");
        }
        
        input.close();
    }
}