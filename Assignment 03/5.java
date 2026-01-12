import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input [cite: 159]
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = number;
        int count = 0;

        // Find count of digits [cite: 160]
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Define array to store digits [cite: 162]
        int[] digits = new int[count];
        temp = number;

        // Save digits in array
        // NOTE: Extracting % 10 gets the last digit first. 
        // So digits[0] will be the last digit (e.g., 5 in 12345).
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display elements in reverse order [cite: 164]
        // Since we stored them "backwards" (ones place at index 0), 
        // printing from 0 to count is actually the reversed number.
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        input.close();
    }
}