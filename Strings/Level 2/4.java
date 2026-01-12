import java.util.Scanner;

public class MinMaxStrings {

    // Method to find shortest and longest strings
    public static void findMinMax(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Shortest Word: " + shortest + " (Length: " + shortest.length() + ")");
        System.out.println("Longest Word: " + longest + " (Length: " + longest.length() + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Custom split logic (simplified for brevity)
        String[] words = text.split(" "); 
        
        findMinMax(words);
        sc.close();
    }
}