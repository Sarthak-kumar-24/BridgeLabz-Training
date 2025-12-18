import java.util.Scanner;



//creating a class named LeapYear to find whether the given year is leap or not

class LeapYear{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the year  as input
           int  year = sc.nextInt();
          

           if(year < 1582){
                       System.out.println("Leap Year calculation is valid only for year >= 1582");
          }

           else if ( year % 400 == 0){
                    System.out.printn("Year os a Leap Year");
           }
            else if (year % 100 ==0){
                       System.out.println("Year is not a leap year");
           }
             else{
                         System.out.println("Yead is not a leap year");
          }



      
          sc.close();


    }
}