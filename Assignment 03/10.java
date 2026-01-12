import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        
        // Create a Scanner Object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Validate the user input: if negative, state invalid and exit
        if (number < 0) {
            System.err.println("Invalid Number. Please enter a positive integer.");
            System.exit(0);
        }

        // --- Step 1: Find the count of digits in the number ---
        long temp = number;
        int count = 0;
        
        // Handle the special case where the number is 0
        if (number == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        // --- Step 2: Save the digits in an array ---
        long[] digits = new long[count];
        temp = number;
        
        // Extract digits and store them in the array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // --- Step 3: Find the frequency of each digit ---
        // We need an array of size 10 (indices 0-9) to store counts for digits 0-9
        int[] frequency = new int[10];

        // Loop through the digits array and update the frequency array
        for (int i = 0; i < digits.length; i++) {
            // The value in digits[i] is the index we want to increment in frequency
            int digit = (int) digits[i];
            frequency[digit]++;
        }

        // --- Step 4: Display the frequency of each digit ---
        System.out.println("\nFrequency of each digit in " + number + ":");
        System.out.println("Digit | Frequency");
        System.out.println("-----------------");
        
        for (int i = 0; i < frequency.length; i++) {
            // Only print digits that actually appeared in the number
            if (frequency[i] > 0) {
                System.out.println("  " + i + "   |    " + frequency[i]);
            }
        }

        // Close the scanner object
        input.close();
    }
}