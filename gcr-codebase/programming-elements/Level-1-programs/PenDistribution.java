// Creating class named PenDistribution to compute the Number of Undistributed Pens


public class PenDistribution {
    public static void main(String[] args) {



        // Total number of pens and students
        int totalPens = 14;
        int totalStudents = 3;



        // Calculating  pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;



        // Single print statement to display output
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens
        );
    }
}
