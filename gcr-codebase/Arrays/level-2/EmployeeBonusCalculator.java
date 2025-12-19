import java.util.Scanner;

// created a class named EmployeeBonusCalculator to store employee salaries, years of services , and calculated bonus

class EmployeeBonusCalculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
                //storing the count of employee
                final int EMPLOYEE_COUNT = 10;

               //arrays to store salaries and years of service 
               double[] salaries =new double[EMPLOYEE_COUNT];
               double[] yearsOfService = new double[EMPLOYEE_COUNT];

 
              //arrays to store bonus and new salaries of employee
              double[] bonuses = new double[EMPLOYEE_COUNT];
              double[] newSalaries = new double[EMPLOYEE_COUNT];



              double totalBonus = 0.0;
              double totalOldSalary = 0.0;
              double totalNewSalary = 0.0;


              //loop to take input for employee salary and year of service
              for(int i=0;i< EMPLOYEE_COUNT; i++){
                      System.out.println("Enter details for employee " + (i+1) );

                      System.out.print("Salary: ");
                      double salary = sc.nextDouble();

                      System.out.print("Years of Service: ");
                      double service = sc.nextDouble();

                      if(salary <= 0 || service <0){
                                 System.out.println("Invalid input");
                                 i--;
                                 continue;

                       }
                    salaries[i] = salary;
                    yearsOfService[i] = service;
               }

               //loop to calculate bonus amount and new salary based on year of service
               for(int i=0;i< EMPLOYEE_COUNT; i++){
                       double bonusRate;

                       if(yearsOfService[i] > 5){
                              bonusRate = 0.05;
                       } else {
                               bonusRate = 0.02;
                       }

                       bonuses[i] = salaries[i] * bonusRate;
                       newSalaries[i] = salaries[i] + bonuses[i];


                      totalBonus += bonuses[i];
                      totalOldSalary += salaries[i];
                      totalNewSalary += newSalaries[i];

                }

 
                System.out.println("Total Old Salary  : " + totalOldSalary);
                System.out.println("Total Bonus Paid : " + totalBonus);
                System.out.println("Total New Salary : " + totalNewSalary);



                sc.close();



         }
}
