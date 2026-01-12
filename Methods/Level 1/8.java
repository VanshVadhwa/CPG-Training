import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest
    public int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = num1;
        int largest = num1;

        // Check for smallest
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        // Check for largest
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmallestLargest program = new SmallestLargest();

        System.out.println("Enter 3 numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int[] result = program.findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        
        input.close();
    }
}