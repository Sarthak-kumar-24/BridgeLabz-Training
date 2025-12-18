import java.util.Scanner;



//creating a class named GradeCalculator to assign remarks and grade based on marksn

class GradeCalculator{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the marks  as input
           int  physics = sc.nextInt();
            int  chemistry = sc.nextInt();
            int maths = sc.nextInt();


              int  total = physics + chemistry + maths;
              double  average =  total/3.0;
          

          char grade;
          String remarks;




          // assigning grade and remarks based on marks given
           if( average >= 80){
                   grade = "A";
                      remarks = "Level 4, above agency-normalized standards";
           }
          else if ( average >= 70){
                   remarks ="B";
                   remarks ="Level 3, at agency-normalized standards";
           }
          else if ( average >= 60){
                   remarks ="C";
                     remarks ="Level 2, below but approaching agency-normalized standards";
              }

          else if ( average >= 50){
                  remarks ="D";
                 remarks ="Level 1, well below agency-normalized standards";
            }
        else if ( average >= 40) {
                  remarks ="E";
                  remarks ="Level 1, too below agency-normalized standards";
          }

         else{
                       remarks ="R";
                      remarks ="Remedial Standards";
           }


          System.out.println("Average marks: "+ average);
          System.out.println("grade: "+ grade);
         System.out.println("remarks: "+ remarks);



      
          sc.close();


    }
}