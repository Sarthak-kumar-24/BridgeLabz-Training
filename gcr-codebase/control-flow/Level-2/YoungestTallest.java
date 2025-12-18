import java.util.Scanner;



//creating a class named YoungestTallest to fidn the youngest and tallest one

class YoungestTallest{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the age and heights  as input
           int  amarAge = sc.nextInt();
            int  akbarAge = sc.nextInt();
            int  anthonyAge = sc.nextInt();
            int  amarHeight = sc.nextInt();
            int  akbarHeight = sc.nextInt();
             int  anthonyHeight = sc.nextInt();
 

             // finding the youngest one and storing it in variable
            String youngest;
            if( amarAge <= akbarAge && amarAge <= anthonyAge){
                           youngest = "Amar";
            }
            else if ( akbarAge <= amarAge && akbarAge <= anthonyAge){
                           youngest = "Akbar";
            }

           else{
                        youngest ="Anthony";
           }

            // finding the tallest one and storing it in variable
           String tallest;

           if (amarHeight >= akbarHeight  &&  amarHeight >= anthonyHeight) {
                      tallest = "Amar";
            }
            else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
                      tallest = "Akbar";
            } 
           else {
                    tallest = "Anthony";
             }


            // Display results
           System.out.println("The youngest friend is " + youngest);
            System.out.println("The tallest friend is " + tallest);

           
      
          sc.close();


     }
}