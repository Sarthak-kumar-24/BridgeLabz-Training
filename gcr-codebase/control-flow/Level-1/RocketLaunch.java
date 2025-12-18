import java.util.Scanner;

//creating a class named RocketLaunch to count down to launch rocket using while

class RocketLaunch{
      public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

            //taking user input as counter
             int counter = sc.nextInt();
             


             //loop till the counter becomes 1
             while( counter >=1){
                       System.out.println(counter);
                       counter--;
               
              }
              System.out.println("Launch");
              sc.close();
       }
}