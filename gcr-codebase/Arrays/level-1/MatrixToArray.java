import java.util.Scanner;


// creating a class named MatrixToArray  that takes 2d array and converts it into 1d array
class  MatrixToArray{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
         int[] array = new int[row * col];
        int index =0;



        // Taking input for matrix elements
        System.out.println("Enter matrix elements:");
         for(int i=0; i < row; i++){
                for(int j=0; j < col; j++){
                          matrix[i][j]  =   sc.nextInt();
                }
          }


         //converting 2D to 1D
         for(int i=0; i < row; i++){
                for(int j=0; j < col; j++){
                          array[index]= matrix[i][j];
                          index++;
                }
          }

        // Displaying the 1D array
        System.out.println("Elements of 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



        sc.close();
    }
}