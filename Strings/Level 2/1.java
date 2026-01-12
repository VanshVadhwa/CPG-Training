import java.util.Scanner;

public class CustomStringLength {

    // Method to find length using Exception Handling
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Tries to access character at index 'count'
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Loop terminates here when index goes out of bounds
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length (Custom Method): " + customLength);
        System.out.println("Length (Built-in Method): " + builtInLength);
        
        sc.close();
    }
}