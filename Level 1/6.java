import java.util.Scanner;

public class SpringSeason {

    // Method to check for spring season
    public boolean isSpringSeason(int month, int day) {
        // Spring is March 20 to June 20
        if (month == 3 && day >= 20 && day <= 31) return true;
        if (month == 4 && day >= 1 && day <= 30) return true;
        if (month == 5 && day >= 1 && day <= 31) return true;
        if (month == 6 && day >= 1 && day <= 20) return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Using Scanner for easier testing
        SpringSeason program = new SpringSeason();

        System.out.print("Enter Month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter Day: ");
        int day = input.nextInt();

        if (program.isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        input.close();
    }
}