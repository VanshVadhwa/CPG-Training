import java.util.Scanner;

public class QuotientRemainder {

    // Method to find quotient and remainder
    public int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuotientRemainder program = new QuotientRemainder();

        System.out.print("Enter Number: ");
        int number = input.nextInt();
        
        System.out.print("Enter Divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int[] result = program.findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
        
        input.close();
    }
}