import java.util.Arrays;
import java.util.Scanner;

public class CustomSplit {

    // Helper to find length manually
    public static int stringLength(String str) {
        int count = 0;
        try { while(true) { str.charAt(count); count++; } } 
        catch(Exception e) { return count; }
    }

    // Method to split text manually
    public static String[] splitText(String text) {
        int len = stringLength(text);
        
        // 1. Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        // 2. Extract words
        String[] words = new String[wordCount];
        String tempWord = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                tempWord += text.charAt(i);
            } else {
                words[index++] = tempWord; // Store word
                tempWord = ""; // Reset for next word
            }
        }
        words[index] = tempWord; // Store last word
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtInSplit));
        System.out.println("Arrays are Equal: " + compareArrays(customSplit, builtInSplit));
        
        sc.close();
    }
}