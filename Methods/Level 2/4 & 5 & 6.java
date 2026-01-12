import java.util.Scanner;

public class UnitConvertor {

    // --- Problem 4 Methods ---
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // --- Problem 5 Methods ---
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    // --- Problem 6 Methods ---
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }
    
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Simple test for one method to demonstrate usage
        System.out.println("10 Km to Miles: " + convertKmToMiles(10));
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("10 Gallons to Liters: " + convertGallonsToLiters(10));
    }
}