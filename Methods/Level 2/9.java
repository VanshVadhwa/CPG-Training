import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                if (isEven(num)) System.out.println(num + " is Positive and Even.");
                else System.out.println(num + " is Positive and Odd.");
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("Comparison of First (" + numbers[0] + ") and Last (" + numbers[4] + "): ");
        if (result == 1) System.out.println("First is Greater");
        else if (result == 0) System.out.println("Both are Equal");
        else System.out.println("First is Smaller");
        
        input.close();
    }
}