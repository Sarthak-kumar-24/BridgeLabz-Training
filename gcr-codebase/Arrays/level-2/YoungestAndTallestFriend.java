import java.util.Scanner;

// created a class named YoungestAndTallestFriend  to find the youngest and tallest friend

class YoungestAndTallestFriend{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
               String[] friends = {"Amar", " Akbar", " Anthony"};


               //arrays to store ages and heights 
               int[] ages =new int[3];
               int[] heights =new int[3];



              //loop to take input for age and height of all 3 
              for(int i=0;i< 3; i++){
                     
                      System.out.println("Age: ");
                      int age = sc.nextInt();

                      System.out.println("height: ");
                      int height = sc.nextInt();

                      if(age <= 1 || height <1){
                                 System.out.println("Invalid input");
                                  i--;
                                 continue;
                                

                       }
                    ages[i] = age;
                    heights[i] = height;
               }
               int youngestIndex =0;
               int tallestIndex =0;

               //loop to calculate youngest and tallest friend
               for(int i=0;i< 3; i++){
                       
                        // Check for youngest friend
                        if (ages[i] < ages[youngestIndex]) {
                                 youngestIndex = i;
                        }

                        // Check for tallest friend
                        if (heights[i] > heights[tallestIndex]) {
                                 tallestIndex = i;
                       }
  
                       
                       
                }

 
              System.out.println(
                                    "Youngest Friend: " + friends[youngestIndex] +
                                     " (Age: " + ages[youngestIndex] + " years)"
                                       );

               System.out.println(
                                      "Tallest Friend: " + friends[tallestIndex] +
                                      " (Height: " + heights[tallestIndex] + " cm)"
                );


                sc.close();



         }
}
