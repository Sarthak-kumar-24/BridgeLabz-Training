import java.util.Scanner;

//creating a class named VotingEligibility to check is he has a valid age or not

class VotingEligibility{
      public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

            //taking user age as input
             int age = sc.nextInt();



             // checking is he is above 18 years
             if( age >= 18 ){

                    System.out.println(
                                   "The person's age is " + age + " and can vote. "
                    );

            } else {
                   
                    // if he is below 18 years
                    System.out.println(
                                  " The person's age is "+ age + " and cannot vote." 
                    );
             }
              sc.close();
       }
}
