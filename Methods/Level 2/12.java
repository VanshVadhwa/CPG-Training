import java.util.Scanner;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate 4 digit number (1000 to 9999)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        double min = numbers[0];
        double max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) System.out.print(num + " ");
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.printf("Min: %.0f\n", stats[1]);
        System.out.printf("Max: %.0f\n", stats[2]);
    }
}