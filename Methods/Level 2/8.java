import java.util.Scanner;

public class FriendsStats {

    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Details for " + friends[i]);
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = input.nextDouble();
        }

        System.out.println("Youngest Friend: " + findYoungest(friends, ages));
        System.out.println("Tallest Friend: " + findTallest(friends, heights));
        
        input.close();
    }
}