import java.util.Scanner;

public class CharTypeDisplay {

    // Reusing logic from Problem 5
    public static String checkType(char ch) {
        if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) return "Not a Letter";
        
        char temp = ch;
        if (temp >= 'A' && temp <= 'Z') temp = (char)(temp + 32);

        if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nChar\tType");
        System.out.println("--------------");
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Ignoring spaces for cleaner output, or you can include them
            if(ch != ' ') {
                System.out.println(ch + "\t" + checkType(ch));
            }
        }
        sc.close();
    }
}