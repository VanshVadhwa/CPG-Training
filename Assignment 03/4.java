import java.util.Scanner;

public class DynamicLargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a large number: ");
        long number = input.nextLong();

        int maxDigit = 10;
        long[] digits = new long[maxDigit];
        int index = 0;
        long temp = number;

        while (temp > 0) {
            // Check if array is full, if so, expand it [cite: 153]
            if (index == maxDigit) {
                maxDigit += 10; // Increase size by 10 [cite: 150]
                
                // Create temp array and copy values [cite: 154]
                long[] tempArray = new long[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray; // Reassign digits to the new larger array
            }
            
            digits[index] = temp % 10;
            index++;
            temp /= 10;
        }

        // Find largest and second largest (same logic as before)
        long largest = -1;
        long secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        input.close();
    }
}