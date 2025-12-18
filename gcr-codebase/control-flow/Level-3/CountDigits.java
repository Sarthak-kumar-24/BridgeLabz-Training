import java.util.Scanner;



//creating a class named CountDigits to count the number of digits

class CountDigits{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number  as input
           int  number = sc.nextInt();



            int count = 0;


        //Use while loop till number is not equal to zero and then one by one dividing 
        //the number by 10, increasing the count 
            while(number != 0){

                    int digit = originalNumber % 10;
                    count ++;
                                      
         
         }



        System.out.println(count);
             
        sc.close();


    }
}