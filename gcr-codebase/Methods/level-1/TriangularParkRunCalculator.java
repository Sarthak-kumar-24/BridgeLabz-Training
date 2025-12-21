import java.util.Scanner;



/*
created a class named TriangularParkRunCalculator and method named calculatePerimeter that calculates the perimter and method calculateRounds that calculates number of rounds .
*/

public class TriangularParkRunCalculator{

    static final double TARGET_DISTANCE_METERS = 5000;

   //method to calculate  perimeter of triangle
    public double calculatePerimeter(double sideA, double sideB, double sideC){
        return sideA+sideB+sideC;
    }

   //method to calculate number of rounds
    public int calculateRounds(double perimeter){
        return (int) ( TARGET_DISTANCE_METERS/ perimeter);
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

         // Creating object to call method
        TriangularParkRunCalculator calculator = new TriangularParkRunCalculator();

        // Taking user input
        System.out.println("Enter length ofside A(in meters) : ");
        double sideA= sc.nextDouble();

        System.out.println("Enter length ofside B(in meters) : ");
        double sideB= sc.nextDouble();


        System.out.println("Enter length ofside C(in meters) : ");
        double sideC= sc.nextDouble();


       

       // none side can be zero or negative
       if(sideA <= 0 || sideB <= 0 || sideC<=0){
           System.out.println("Error: All sides must be positive values.");
           sc.close();
           return;
       }

       // Calculating number of rounds to complete 5 km and perimeter
       double perimeter = calculator.calculatePerimeter(sideA, sideB, sideC);
       double roundsRequired = calculator.calculateRounds(perimeter);

       // Displaying result
       System.out.println(
                                     "Perimeter of the trianguar park :  "+ perimeter+ " meters
                                    
                                
       );
       System.out.println(
                                     "Number of rounds to complete 5 km :  "+ roundsRequired
                                    
                                
       );

       sc.close();


   }
}