import java.util.Scanner;

public class VowelConsonantCount {

    // Check if char is a letter
    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    // Check classification
    public static String checkType(char ch) {
        if (!isLetter(ch)) return "Not a Letter";
        
        // Convert to lowercase using ASCII (A=65, a=97, diff=32)
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public static int[] countTypes(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = checkType(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] counts = countTypes(text);
        
        System.out.println("Vowels Count: " + counts[0]);
        System.out.println("Consonants Count: " + counts[1]);
        sc.close();
    }
}