import java.util.Scanner;


// creating a class named ArraySumUntilLimit  that stores multiple double values in an array
// up to a maximum of 10 elements OR until the user enters
// 0 or a negative number and then does sum.

class  ArraySumUntilLimit{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


       double total = 0.0;
       int index =0;
     
        double[] numbers = new double[10];


  

       // Taking user input and storing values until limit or stop condition
        while(true){
             
             if(index == numbers.length){
                   System.out.println("Maximum limit of 10 numbers reached. ");
                   break;
             }

            System.out.print("Enter number: ");
            double input = sc.nextDouble();

             if ( input <= 0){
                  System.out.println(
                            "Input stopped due to 0 or negative number.");
                            break;
                  
            }
              numbers[index]= input;
              index++;
        } 


        for (int i = 0; i < index; i++) {

            total += numbers[i];
        }

        // Displaying  the total sum
        System.out.println("Total Sum: " + total);


     sc.close();
    }
}