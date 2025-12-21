import java.util.Scanner;




/*
created a class named HandshakeCalculator and method named calculateMaxHandshakes that calculates the maximum number of handshakes  possible among a given number of students.
*/

pubic class HandshakeCalculator{

    public int calculateMaxHandshakes(int numberOfStudents){
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }


    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

         // Creating object to call method
        HandshakeCalculator calculator = new HandshakeCalculator();

        // Taking user input
        System.out.println("Enter number of students: ");
        int numberOfStudents= sc.nextInt();

       

       // Handshakes possible only if students >= 2
       if(numberOfStudents < 2){
           System.out.println("At least 2 students are required for handshakes.");
           sc.close;
           return;
       }

       // Calling instance method
       int maxHandshakes = calculator.calculateMaxHandshakes(numberOfStudents);

       // Displaying result
       System.out.println(
                                     "The maximum number of possible handshakes among "
                                      + numberOfStudents + " students is: " + maxHandshakes
                                
       );
       sc.close();


   }
}