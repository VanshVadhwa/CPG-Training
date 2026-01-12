import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate exception
    public static void generateException(String text) {
        // Accessing index equal to length (valid indices are 0 to length-1)
        System.out.println("Char at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println("Char at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
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