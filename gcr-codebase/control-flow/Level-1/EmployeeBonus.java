import java.util.Scanner;



//creating a class named EmployeeBonus  to compute the bonus amount 


class EmployeeBonus{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the salary and years of experience as input
           int salary = sc.nextInt();
           int yearsOfService = sc.nextInt();


         // checking if his year of experience is above 5 years and then calculating the bonus
         if( yearsOfService > 5 ){

                 int bonusAmount = salary  *  (5/100);
                 
                 System.out.println(" BonusAmount : " + bonusAmount );

         }
     
     sc.close();


     }
}