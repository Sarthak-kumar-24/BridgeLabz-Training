import java.util.Scanner;

//creating a class named RocketLaunchUsingFor to count down to launch rocket using for loop

class RocketLaunchUsingFor{
      public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

            //taking user input as counter
             int counter = sc.nextInt();
             


             //loop till the counter becomes 1
             for(int i = counter; i >= 1; i--) {
                       System.out.println(i);
               
              }
              System.out.println("Launch");
              sc.close();
       }
}