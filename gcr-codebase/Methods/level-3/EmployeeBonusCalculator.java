/*
created a class named EmployeeBonusCalculator that  
calculates bonus for 10 employees of Zara
based on their years of service and displays
old salary, bonus, and new salary in tabular form.
*/

public class EmployeeBonusCalculator{

   //Generates salary and years of service for employees.
   public static int[][] generateEmployeeData() {

       int[][] data = new int[10][2];
       for (int i = 0; i < data.length; i++) {

           // Generate 5-digit salary (10000 to 99999)
           data[i][0] = (int) (Math.random() * 90000) + 10000;

           // Generate years of service (1 to 10)
           data[i][1] = (int) (Math.random() * 10) + 1;
       }

        return data;

   }

   /**
    *Calculates bonus and new salary.
    * 2D array structure:
    * column 0 -> old salary
    * column 1 -> years of service
    * column 2 -> bonus amount
    * column 3 -> new salary
   */
   public static double[][] calculateBonusAndNewSalary(int[][] data) {

      double[][] result = new double[10][4];

       for (int i = 0; i < data.length; i++) {

            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            // Bonus logic
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
   }

   //Displays employee data and calculates totals.
   public static void displayReport(double[][] data) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < data.length; i++) {

            System.out.printf(
                "%d\t%.0f\t\t%.0f\t%.2f\t\t%.2f%n",
                (i + 1),
                data[i][0],
                data[i][1],
                data[i][2],
                data[i][3]
            );

            totalOldSalary += data[i][0];
            totalBonus += data[i][2];
            totalNewSalary += data[i][3];
        }

        System.out.println("\n--- Company Summary ---");
        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }


   public static void main(  String[] args  ) {

       Scanner sc = new Scanner(System.in);

        // Step 1: Generate employee data
        int[][] employeeData = generateEmployeeData();

        // Step 2: Calculate bonus and new salary
        double[][] finalData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display report
        displayReport(finalData);
   }
}