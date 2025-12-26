import java.util.Scanner;

/**
 * ResultGenerator
 *
 * Generates student results for a coaching center:
 * 1) Takes marks of 5 subjects
 * 2) Calculates average marks
 * 3) Assigns grade using switch statement
 */
public class ResultGenerator {

    private static final int SUBJECT_COUNT = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        System.out.println(" Raj's Coaching Center – Result Generator\n");

        // Input marks using for-loop
        for (int i = 1; i <= SUBJECT_COUNT; i++) {

            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println(" Invalid marks! Please enter between 0 and 100.");
                i--; // retry same subject
                continue;
            }

            totalMarks += marks;
        }

        // Calculate average
        double average = (double) totalMarks / SUBJECT_COUNT;

        // Assign grade using switch
        char grade;

        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("\nResult Summary");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
