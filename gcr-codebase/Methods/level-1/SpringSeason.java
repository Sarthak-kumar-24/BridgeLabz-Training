


/*created a class named SpringSeason and method named checkSpringSeason that checks if the dates lies in spring season or not
*/

public class SpringSeason{

 

   //method to check spring season
    public boolean checkSpringSeason(int month, int day){
        if( month == 3 && day >= 20 && day <=31){
           return true;
       }
       if(month ==4 || month ==5){
            return true;
        }

        if(month ==6 && day >= 1 && day <= 20){
           return true;
       }
       return false;
    }



    public static void main(String[] args){

       if(args.length != 2){
           System.out.println("give two arguments");
           return;
       }

       int month = Integer.parseInt(args[0]);
       int day = Integer.parseInt(args[1]);


       SpringSeason seasonChecker = new SpringSeason();

       boolean isSpring = seasonChecker.checkSpringSeason(month, day);
       

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }


   }
}