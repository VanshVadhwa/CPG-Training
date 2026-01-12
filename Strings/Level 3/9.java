import java.util.Scanner;

public class CalendarDisplay {

    // Arrays for month names and days
    static String[] months = {"", "January", "February", "March", "April", "May", "June", 
                              "July", "August", "September", "October", "November", "December"};
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get day of week (0=Sun, 1=Mon, ...)
    public static int getDayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        // Update Feb days if leap year
        if (m == 2 && isLeapYear(y)) days[2] = 29;

        // Get starting day of the month
        int d0 = getDayOfWeek(m, 1, y);

        System.out.println("\n   " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%3d ", i);
            if ((i + d0) % 7 == 0) System.out.println(); // New line after Saturday
        }
        System.out.println();
        sc.close();
    }
}