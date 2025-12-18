import java.util.Scanner;



//creating a class named ArmStrong to check whether the number is armstrong

class ArmStrong{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number  as input
           int  number = sc.nextInt();



            int  sum = 0;
            int originalNumber = number;


        //Use while loop till originalNumber is not equal to zero and then one by one dividing the number y 10 and      cubing its digits and adding the cube to sum

         while(originalNumber != 0){

                    int digit = originalNumber % 10;
                    sum = sum + (digit * digit * digit);
                    originalNumber = originalNumber / 10;
                  
         
         }


       //verifying if the number is equal to the sum 
       if (number == sum) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
      
        sc.close();


    }
}