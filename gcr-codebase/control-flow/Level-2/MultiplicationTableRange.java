import java.util.Scanner;



//creating a class named MultiplicationTableRange  

class MultiplicationTableRange{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number as input
           int  number = sc.nextInt();
           

         // printing the table
         for(int i=6;i< =9;i++){
              System.out.println( number + " * " + i + " = " + (number * i));
        
           }   
  
          sc.close();


     }
}