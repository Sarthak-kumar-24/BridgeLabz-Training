/*
created a class named FootballTeamHeightAnalyzer that
find the shortest, tallest, and mean height of players present in a football team.

*/



public class FootballTeamHeightAnalyzer {
   public int findSum( int[] heights ) {
       int sum = 0;
       for (int height : heights) {
           sum += height;
       }
       return sum;
   }

   //finds the mean height
   public double findMean( int[]  heights ){
       int sum = findSum( heights );
       return (double) sum/ heights.length;
   }

   //finds the shortest height
   public int findShortest(int[]  heights){
       int min =  heights[0];
       for(int height : heights){
           if(height  <  min){
               min = height;
           }
       }
       return min;
   }

   //find the tallest height
   public int findTallest( int[] heights ) {
       int max = heights[0];
       for (int height : heights) {
           if ( height  > max ) {
               max = height;
           }
       }
       return max;
   }


   public static void main(String[] args) {

       int[] heights = new int[11];
       for (int i = 0; i < heights.length;  i++) {
           heights[i] = ( int ) (Math.random() * 101) + 150;
       }

       //creating object
       FootballTeamHeightAnalyzer analyzer = new FootballTeamHeightAnalyzer();

       System.out.println("Player Heights (in cm):");
       for (int height : heights) {
           System.out.print(height + " ");
       }
      
       //getting the shortest, tallest and mean value and storing them
       int shortest = analyzer.findShortest(heights);
       int tallest = analyzer.findTallest(heights);
       double mean = analyzer.findMean(heights);

       //printing the results
       System.out.println("\n\nResults:");
       System.out.println("Shortest Height: " + shortest + " cm");
       System.out.println("Tallest Height: " + tallest + " cm");
       System.out.println("Mean Height: " + mean + " cm");
   }
}