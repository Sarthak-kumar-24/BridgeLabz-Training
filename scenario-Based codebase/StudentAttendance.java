import java.util.Scanner;

/*
School Bus Attendance System 
Track 10 students' presence.
 Use for-each loop on names.
Ask "Present or Absent?"
Print total present and absent counts.



*/
public class StudentAttendance{

   public static final int NUMBER_OF_STUDENT = 10;
   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       int totalStudentPresent =0;
       int totalStudentAbsent =0;

       //array of student names
       String[] namesOfStudents = { "Sarthak", "Raghav", "DeviJii", "Satyam", "Shubham", 
                                                               "Prithvi", "Ritigya", "Nishita",  "Shivmani", "Ankit"};


       for( String  student : namesOfStudents){

           System.out.print("Is " + student + " Present or Absent? : ");
           String status = sc.next().toLowerCase();

           //based on calling, attendance mark down
            if (status.equals("present")) {
                totalStudentPresent++;
            } else if (status.equals("absent")) {
               totalStudentAbsent++;
            } else {
                System.out.println("Invalid input! Marked as Absent by default.");
                totalStudentAbsent++;
            }
       }

        // Displays final attendance summary of students
        System.out.println("\n---------------------------Report--------------------------------");
        System.out.println("\n Attendance Summary");
        System.out.println("Total Students Present : " + totalStudentPresent);
        System.out.println("Total Students Absent  : " + totalStudentAbsent);

        sc.close();
    }

}