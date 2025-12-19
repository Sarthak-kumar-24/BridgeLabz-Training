import java.util.Scanner;

// created a class named  ReverseNumberUsingArray to reverse the number using array

class ReverseNumberUsingArray{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    // Handling negative numbers
    if(number < 0){
       number = Math.abs(number);
    }

    int temp = number;

    //counting of digits
    int digitCount =0;
    while(temp != 0){
       digitCount++;
       temp = temp/10;
    }

    if(digitCount ==0){
       digitCount =1;
    }

    //Array to store digits
    int[] digits = new int[ digitCount];

    int index =0;
    while(number != 0){
       digits[index] = number %10;
       index++;
       number = number /10;
    }

    //Array to store digits in reverse order
    int[] reverseDigits = new int[digitCount];

    for(int i=0; i< digitCount; i++){
       reverseDigits[i] = digits[digitCount -1 -i];
    }


    //Display reversed number
    System.out.print("Reversed Number : ");

    for(int i=0;i<digitCount;i++){
       System.out.print(reverseDigits[i]);
    }

    sc.close();

    }
}
