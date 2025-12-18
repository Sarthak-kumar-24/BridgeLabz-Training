import java.util.Scanner;



//creating a class named LeapYearSingleIf to find whether the given year is leap or not

class LeapYearSingleIf{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the year  as input
           int  year = sc.nextInt();
          

           if(  year >= 1582 &&
                ( year % 400 ==0 || ( year % 4 == 0 && year % 100 != 0))){
                       System.out.println("Year is a leap year");
          }

            else{
                         System.out.println("Yead is not a leap year");
          }



      
          sc.close();


    }
}