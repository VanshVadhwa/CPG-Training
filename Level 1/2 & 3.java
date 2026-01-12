import java.util.Scanner;

public class Handshakes {

    // Method to calculate number of handshakes
    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Handshakes program = new Handshakes();

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = program.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);
        
        input.close();
    }
}