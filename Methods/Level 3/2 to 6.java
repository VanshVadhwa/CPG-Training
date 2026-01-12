import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    // --- Helper Methods (Common) ---
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // --- Problem 2 Methods ---
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true; // Duck number has a zero (but not at start)
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == number;
    }

    // --- Problem 3 Methods ---
    public static boolean isHarshad(int number) {
        int sum = 0;
        int temp = number;
        while(temp > 0) { sum += temp % 10; temp /= 10; }
        return number % sum == 0;
    }

    public static void displayFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; // Set digit labels
        
        for (int d : digits) freq[d][1]++; // Count frequency

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) System.out.println(freq[i][0] + ": " + freq[i][1]);
        }
    }

    // --- Problem 4 Methods ---
    public static boolean isPalindrome(int[] digits) {
        int start = 0, end = digits.length - 1;
        while (start < end) {
            if (digits[start] != digits[end]) return false;
            start++; end--;
        }
        return true;
    }

    // --- Problem 5 Methods ---
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String sNum = String.valueOf(number);
        String sSquare = String.valueOf(square);
        return sSquare.endsWith(sNum);
    }
    
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while(temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for(int i=1; i<=digit; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        int[] digits = getDigits(n);

        System.out.println("Is Armstrong: " + isArmstrong(n, digits));
        System.out.println("Is Harshad: " + isHarshad(n));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Prime: " + isPrime(n));
        System.out.println("Is Neon: " + isNeon(n));
        System.out.println("Is Spy: " + isSpy(n));
        System.out.println("Is Automorphic: " + isAutomorphic(n));
        System.out.println("Is Strong: " + isStrong(n));
        
        displayFrequency(digits);
        sc.close();
    }
}