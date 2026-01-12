import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " CAN vote.");
            } else {
                System.out.println("Student " + (i + 1) + " CANNOT vote.");
            }
        }
        input.close();
    }
}