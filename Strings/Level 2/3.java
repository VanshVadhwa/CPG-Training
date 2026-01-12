import java.util.Scanner;

public class WordLengthAnalysis {

    // Reusing the split logic from Problem 2
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        String temp = "";
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') temp += text.charAt(i);
            else { words[idx++] = temp; temp = ""; }
        }
        words[idx] = temp;
        return words;
    }

    // Method to create 2D array of Word + Length
    public static String[][] analyzeWords(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length()); // Convert int length to String
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] analysis = analyzeWords(words);

        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}