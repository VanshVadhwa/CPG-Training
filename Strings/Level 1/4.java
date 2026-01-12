public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This line causes the exception because text is null
        System.out.println("Length is: " + text.length()); 
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length is: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: String is null, cannot find length.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Generating Exception ---");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred in main: " + e);
        }

        System.out.println("\n--- Handling Exception ---");
        handleException();
    }
}