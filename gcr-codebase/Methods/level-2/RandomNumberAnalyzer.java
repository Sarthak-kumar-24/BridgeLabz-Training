

/*
created a class named RandomNumberAnalyzer
Generates an array of 4-digit random numbers
Finds their average, minimum, and maximum values
 using Math.random(), Math.min(), and Math.max().

*/

public class RandomNumberAnalyzer{

   public static int[] generate4DigitRandomArray(int size){

       int[] numbers = new int[size];

       // Math.random() generates value between 0.0 and 1.0 and then 1000 to 9999
       for(int i=0;i<size;i++){
           numbers[i] = (int) (Math.random()*9000)+1000;
       }
       return numbers;
   }

   public static double[] findAverageMinMax(int[] numbers){

       int min = numbers[0];
       int max = numbers[0];
       int sum =0;

       for(int num : numbers){
           sum += num;
           min = Math.min(min, num);
           max= Math.max(max, num);
       }

       double average = (double) sum/ numbers.length;
       return new double[]{ average, min, max};
   }

   public static void main(String[] args){

       // Generate 5 random 4-digit numbers
       int[] randomNumbers = generate4DigitRandomArray(5);

       System.out.println("generated 4-digit random numbers: ");
       for(int num: randomNumbers){
           System.out.println(num + " ");
       }

       // Find average, min, and max
       double[] result = findAverageMinMax(randomNumbers);


       System.out.println("\n\nResults:");
       System.out.println("Average: " + result[0]);
       System.out.println("Minimum: " + (int) result[1]);
       System.out.println("Maximum: " + (int) result[2]);

   }
}


