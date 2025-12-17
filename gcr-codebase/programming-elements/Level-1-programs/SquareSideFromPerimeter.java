import java.util.Scanner;

//creating a class named SquareSideFromPerimeter to find length of side of square by its perimeter



public class SquareSideFromPerimeter {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


        // Taking perimeter from user
        double perimeter = input.nextDouble();



        // Perimeter of square = 4 * side
        double side = perimeter / 4;



        // Displaying thr  result
        System.out.println(
                "The length of the side is " + side +
                " whose perimeter is " + perimeter
        );

     }
}
