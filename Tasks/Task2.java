import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify the number of subjects:");
        int subjects = sc.nextInt();
        int sum = 0;
        double average = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter the marks obtained in subject " + i + " (out of 100):");
            int subjectMarks = sc.nextInt();
            sum += subjectMarks;
        }
        sc.close();

        average = (double) sum / subjects;

        System.out.println("The total marks obtained are: " + sum);
        System.out.println("The average percentage is: " + average + "%");

        if (average >= 90) {
            System.out.println("The final grade is: A+");
        } else if (average >= 80 && average < 90) {
            System.out.println("The final grade is: A");
        } else if (average >= 70 && average < 80) {
            System.out.println("The final grade is: B+");
        } else if (average >= 60 && average < 70) {
            System.out.println("The final grade is: B");
        } else if (average >= 55 && average < 60) {
            System.out.println("The final grade is: C+");
        } else if (average >= 50 && average < 55) {
            System.out.println("The final grade is: C");
        } else if (average >= 45 && average < 50) {
            System.out.println("The final grade is: D+");
        } else if (average >= 40 && average < 45) {
            System.out.println("The final grade is: D");
        } else {
            System.out.println("You have failed.");
        }
    }
}
