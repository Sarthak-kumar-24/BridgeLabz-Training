import java.util.Scanner;

//created a class named StudentGradeCalculator that calculates the percentage, assigns grades based
 // on defined criteria, and displays the result for each student.


class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        //Take input for number of students
        System.out.print("Enter  number of students: ");
        int  numberOfStudents  = sc.nextInt();

        if(numberOfStudents <= 0){
            System.out.println("Error");
            sc.close;
            return;
        }

        //Creating arrays
        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new  char[numberOfStudents];

        //Taking input for marks
        for(int i=0; i< numberOfStudents;i++){
            System.out.println("Enter marks for Student "+ (i + 1));

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            // Validate marks
            if(p < 0 || c <0|| m < 0){

                System.out.println("Invalid marks! Enter positive values only.");
                i--;
                continue;
           }


           physics[i] = p;
           chemistry[i] = c;
           maths[i] = m;
       }


       // Calculating percentage and grade
       for(int i=0; i< numberOfStudents; i++){

           int totalMarks = physics[i] + chemistry[i] + maths[i];
           percentages[i] = totalMarks / 3.0;

           // Assigning grade based on percentage
           if(percentages[i] >= 80){
               grades[i] = "A";
           }
           else if(percentages[i] >= 70){
               grades[i] = "B";
           }

           else if(percentages[i] >= 60){
               grades[i] = "C";
           }

           else if(percentages[i] >= 50){
               grades[i] = "D";
           }

           else if(percentages[i] >= 40){
               grades[i] = "E";
           }

           else{
               grades[i] = "R";
           }
       }


       for(int i =0; i< numberOfStudents;i++){

           System.out.println("Student "+ (i+1) +":");
           System.out.println("Physics :  "+       physics[i] );
           System.out.println("Chemistry  :"+   chemistry[i] );
           System.out.println("maths  :"+           maths[i] );
           System.out.println("Percentage "+ percentages[i] +"%");
           System.out.println("grade "+ grade[i] );
           System.out.println();
       }

       sc.close();

   }
}



