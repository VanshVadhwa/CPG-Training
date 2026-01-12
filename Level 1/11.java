import java.util.Scanner;

public class WindChill {

    // Method to calculate wind chill
    public double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WindChill program = new WindChill();

        System.out.print("Enter Temperature (Fahrenheit): ");
        double temp = input.nextDouble();
        
        System.out.print("Enter Wind Speed (mph): ");
        double speed = input.nextDouble();

        // Note: Formula is valid for T < 50 and V > 3
        if (Math.abs(temp) > 50 || speed > 120 || speed < 3) {
            System.out.println("Note: Formula is best valid for T < 50 in Fahrenheit and wind speed 3-120 mph.");
        }

        double windChill = program.calculateWindChill(temp, speed);
        System.out.println("Wind Chill Temperature: " + windChill);
        
        input.close();
    }
}