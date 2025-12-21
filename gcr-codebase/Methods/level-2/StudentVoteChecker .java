import java.util.Scanner;


/*
created a class named StudentVoteChecker that Checks whether a student can vote.

*/

public class StudentVoteChecker {

    
    public boolean canStudentVote(int age){

       // Validate negative age
       if(age <=0){
            System.out.println("Invalid age");
            return false;
       }
        if (age >= 18) {
            return true;
        }

        return false;
               
   }


    .
    public static void main (String[] args) {

          Scanner sc= new Scanner(System.in);

          // Array to store ages of 10 students
          int[] ages = new int[10];

           // Creating object to call non-static method
          StudentVoteChecker checker = new StudentVoteChecker();

          // Taking input and checking voting eligibility
          for (int i = 0; i < ages.length; i++) {
              System.out.print("Enter age of student " + (i + 1) + ": ");
              ages[i] = sc.nextInt();

              // Calling method to check voting eligibility
              boolean canVote = checker.canStudentVote(ages[i]);

              // Displaying result
              if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
              } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
              }
            }
    sc.close();

    }

}