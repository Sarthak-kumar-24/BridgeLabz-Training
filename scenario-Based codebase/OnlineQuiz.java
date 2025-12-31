import java.util.Scanner;

/*
17. Online Quiz Application 
 Ask 5 questions (MCQs) from a user.
 Use arrays and for-loop.
 Record score.
 Switch for answer checking. Apply clear indentation and structured layout.

*/
public class OnlineQuiz{

   public static void main( String[] args){
       Scanner sc = new Scanner(System.in);


       String[] questions = { "1. What is the size of int in Java?\n\nA) 2 bytes \nB) 4 bytes  \nC) 8 bytes  \nD) Depends on OS  ",
                                            "2. Which keyword is used to inherit a class?\n\nA) this \nB) super  \nC) extends \nD) implements " ,
                                            "3. Which loop is guaranteed to run at least once?\n\nA) for  \nB) while  \nC) do-while  \nD) foreach" ,                       
                                            "4. Which of these is not a primitive data type?\n\nA) int  \nB) float  \nC) String  \nD) char " , 
                                            "5. Which symbol is used for single-line comments?\n\nA) /*    \nB) //    \nC) ##   \nD) <!-- "   };





       char[] answers = { 'B', 'C', 'C', 'C', 'B' };
       int score =0;

       for (int i = 0; i < questions.length; i++) {

           System.out.println(questions[i]);

           System.out.print("\nEnter your answer (A/B/C/D): ");
           char userAnswer = sc.next().toUpperCase().charAt(0);


           switch(userAnswer){

               case 'A':
               case 'B':
               case 'C':
               case 'D':
               if (userAnswer == answers[i]) {
                   System.out.println(" Correct!\n");
                   score++;
               } 
               else{
                   System.out.println(" Wrong! Correct answer is: " + answers[i] + "\n");
               }
              break;

               default:
                   System.out.println(" Invalid option! Skipped.\n");

           }
        }

         System.out.println("\n---------------------------------Result Summary----------------------------------");

        System.out.println("Total answered : "+ questions.length);

        System.out.println("Total correct answers: "+ score);

   sc.close();
   }
}