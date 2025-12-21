import java.util.Scanner;


/*
created a class named FriendComparison that
takes age and height of three friends
 (Amar, Akbar, and Anthony) and determines:
 1. The youngest friend based on age
 2. The tallest friend based on height
*/

public class FriendComparison {

    
    public String findYoungest(int[] ages, String[] names) {

       
       int minIndex = 0;

        // Compare ages to find minimum
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }

        return names[minIndex];
               
    }

    public String findtallest( double[] heights, String[] names){
        int maxIndex =0;

        // Compare heights to find maximum
        for(int i=1; i< heights.length;i++){
            if(heights[i] > heights[maxIndex]){
               maxIndex =i;
           }
         }
        return names[maxIndex];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] ages = new int[3];
        double[] heights= new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Creating object to call non-static methods
        FriendComparison comparison = new FriendComparison();

        // Finding youngest and tallest
        String youngestFriend = comparison.findYoungest(ages, names);
        String tallestFriend = comparison.findTallest(heights, names);

        // Displaying results
        System.out.println("Youngest friend: " + youngestFriend);
        System.out.println("Tallest friend: " + tallestFriend);


    sc.close();

    }

}