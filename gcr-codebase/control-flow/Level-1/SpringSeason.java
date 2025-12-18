import java.util.Scanner;

//creating a class named SpringSeason to check if the user entered details lies in spring season range

class SpringSeason{
      public static void main(String args[]){
             
            //taking user input as month and day
             int month = Integer.parseInt(args[0]);
             int day = Integer.parseInt(args[1]);



             // checking if it is in the spring season range or not
             if( (month == 3 && day >= 20) || ( month ==4 ) || (month ==5) || (month == 6 && day <= 20) ){

                    System.out.println( "Its a Spring Season" );

            } else {

                    System.out.println("Not a Spring Season");
             }

              sc.close();
       }
}