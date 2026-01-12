import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find distribution details
    public int[] findChocolatesAndRemainder(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChocolateDistribution program = new ChocolateDistribution();

        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        if (children == 0) {
            System.out.println("Cannot distribute to 0 children.");
        } else {
            int[] result = program.findChocolatesAndRemainder(chocolates, children);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        
        input.close();
    }
}