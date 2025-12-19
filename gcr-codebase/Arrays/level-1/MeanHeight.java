import java.util.Scanner;


// creating a class named MeanHeight  that takes the players heights
//  and calculates the mean height

class  MeanHeight{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


         // Array to store the  11 players height
        double[] heights = new double[11];
        double sum = 0.0;


      for(int i=0; i < heights.length; i++){

                 heights[i]  = sc.nextDouble();
       }


              
      for(int i=0; i < heights.length ; i++){
                sum += heights[i];
       }

      double meanheight = sum / 11;


       //printing the mean height 
       System.out.println("The mean height of football team is " + meanHeight  );
    
     

     sc.close();
    }
}