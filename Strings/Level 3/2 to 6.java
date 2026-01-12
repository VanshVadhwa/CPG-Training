import java.util.Scanner;

public class StringAnalysis {

    // --- Problem 2: Find Unique Characters ---
    public static char[] findUniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            // Check if seen before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique += current;
        }
        return unique.toCharArray();
    }

    // --- Problem 3: First Non-Repeating Character ---
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        // Find first with count 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null char if none found
    }

    // --- Problems 4, 5, 6: Character Frequency ---
    public static void findFrequency(String text) {
        int[] freq = new int[256];
        // Populate frequency array (ASCII mapping)
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");
        // Display only characters that appear
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "' : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // 2. Unique Chars
        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique Characters: ");
        System.out.println(unique);

        // 3. First Non-Repeating
        char fnr = firstNonRepeating(text);
        if (fnr != '\0') System.out.println("First Non-Repeating Character: " + fnr);
        else System.out.println("No non-repeating characters found.");

        // 4-6. Frequency
        findFrequency(text);
        
        sc.close();
    }
}