import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian Calendar).");
            return false;
        }
        // Logic: Divisible by 4 AND (Not divisible by 100 OR Divisible by 400)
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        input.close();
    }
}