import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception (start index > end index)
    public static void generateException(String text) {
        System.out.println(text.substring(3, 1)); 
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: Start index cannot be greater than end index."); [cite_start]// [cite: 918]
        } catch (RuntimeException e) {
            System.out.println("Caught Runtime Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text (at least 4 chars): ");
        String text = sc.next();

        System.out.println("--- Generating Exception ---");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in main: " + e);
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(text);
        
        sc.close();
    }
}