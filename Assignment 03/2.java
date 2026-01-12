import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Names are fixed as per problem description
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height [cite: 129]
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            
            System.out.print("Height (cm): ");
            heights[i] = input.nextDouble();
            
            // Basic validation
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; 
            }
        }

        // Initialize variables for youngest and tallest logic
        // We assume the first person is both youngest and tallest initially
        int minAge = ages[0];
        int youngestIndex = 0;
        
        double maxHeight = heights[0];
        int tallestIndex = 0;

        // Loop through array to find youngest and tallest [cite: 130]
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
            
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display results [cite: 131]
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + minAge + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + maxHeight + "cm)");
        
        input.close();
    }
}