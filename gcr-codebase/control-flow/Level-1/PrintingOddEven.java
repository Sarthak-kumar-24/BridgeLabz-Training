import java.util.Scanner;



//creating a class named PrintingOddEven  to print all even and odd numbers till n


class PrintingOddEven{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number n as input
           int n = sc.nextInt();


          // loop to iterate and print if it is odd or even 
          for( int i= 1;i< = n;i++){                 
                if( i % 2 ==0) {
                        System.out.println( i + " is even ");
                } else {

                System.out.println( i + " is odd ");
               }

          }    

     
     sc.close();


     }
}