import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input [cite: 134]
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Define array with initial maxDigit size [cite: 135]
        int maxDigit = 10;
        long[] digits = new long[maxDigit];
        int index = 0;
        
        long temp = number;

        // Loop to extract digits [cite: 138]
        while (temp > 0) {
            // Check if array is full [cite: 140]
            if (index == maxDigit) {
                System.out.println("Max digit limit reached. Stopping extraction.");
                break; // [cite: 141]
            }
            
            digits[index] = temp % 10; // [cite: 139]
            index++;
            temp /= 10;
        }

        // Find largest and second largest [cite: 142]
        long largest = -1;
        long secondLargest = -1;

        for (int i = 0; i < index; i++) { // Loop only up to 'index' (filled count)
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results [cite: 144]
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        input.close();
    }
}