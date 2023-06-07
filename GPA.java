import java.util.Scanner;
public class GPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = input.nextDouble();

        char gpa;

        if (score >= 90) {
            gpa = 'A';
        }
        else if (score >= 80) {
            gpa = 'B';
        }
        else if (score >= 70) {
            gpa = 'C';
        }
        else if (score >= 60) {
            gpa = 'D';
        }
        else {
            gpa = 'F';
        }

        System.out.printf("GPA is: %s", gpa);
    }
}
