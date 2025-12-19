import java.util.Scanner;


// creating a class named StudentVotingEligibility  that takes the age of 10 students as input
//  and checks whether each student is eligible to vote.

class  StudentVotingEligibility{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];


       System.out.println("Enter the 10 students ages");
       
      for(int i=0;i< studentAges.length; i++){
             System.out.print("Enter age of student " + (i + 1) + ": ");
             studentAges[i] = sc.nextInt();
       }


       // Looping through the array to check voting eligibility
       for(int i=0; i< studentAges.length; i++){
             int age = studentAge[i];
             
             if(age < 0){
                  System.out.println(
                            "Student " + ( i+1)+ " has an invalid age: " + age );
             }
             else if ( age >= 18){
                  System.out.println(
                            "Student with the age  " + age + " can vote. ");
             }

             else {
                   System.out.println(
                            "Student with the age  " + age + " cannot  vote. ");
             
       } 
     sc.close();
    }
}