import java.util.Scanner;

/**
 * created a class named RockPaperScissorsGame that
 *simulates a Rock-Paper-Scissors game between
 * a user and the computer across multiple games.
 * It displays game-wise results, total wins, and winning percentages.
 */


public class RockPaperScissorsGame {

   private static final String ROCK = "rock";
   private static final String PAPER = "paper";
   private static final String SCISSORS = "scissors";


   public static String getComputerChoice() {

       int random = (int) (Math.random() * 3);

       if (random == 0) return ROCK;
       if (random == 1) return PAPER;
       return SCISSORS;
   }

   //Determines the winner between user and computer.
   public static String findWinner(String userChoice, String computerChoice) {

       if (userChoice.equals(computerChoice)) {
           return "Draw";
       }

       if (
              (userChoice.equals(ROCK) && computerChoice.equals(SCISSORS)) ||
              (userChoice.equals(PAPER) && computerChoice.equals(ROCK)) ||
              (userChoice.equals(SCISSORS) && computerChoice.equals(PAPER))
           ) {
           return "User";
       }
       return "Computer";
   }



   //Calculates total wins and winning percentages.
   public static String[][] calculateStats(String[] results, int totalGames) {
       int userWins = 0;
       int computerWins = 0;
       for (String result : results) {
           if (result.equals("User")) userWins++;
           else if (result.equals("Computer")) computerWins++;
       }

       double userPercentage = (userWins * 100.0) / totalGames;
       double computerPercentage = (computerWins * 100.0) / totalGames;

       return new String[][]{
                  {"User Wins", String.valueOf(userWins), String.format("%.2f", userPercentage) + "%"},
                  {"Computer Wins", String.valueOf(computerWins), String.format("%.2f", computerPercentage) + "%"}
       };
   }


   //Displays game-wise results and final statistics.
   public static void displayResults(
             String[] userChoices,
             String[] computerChoices,
             String[] results,
             String[][] stats
             ) {

       System.out.println("\nGame\tUser\t\tComputer\tWinner");
       System.out.println("------------------------------------------------");

       for (int i = 0; i < results.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    userChoices[i] + "\t\t" +
                    computerChoices[i] + "\t\t" +
                    results[i]
            );
        }

        System.out.println("\nFinal Statistics");
        System.out.println("------------------------------------");
        System.out.println("Player\t\tWins\tWinning %");

        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] userChoices = new String[games];
        String[] computerChoices = new String[games];
        String[] results = new String[games];

        for (int i = 0; i < games; i++) {

            System.out.print("\nGame " + (i + 1) + " - Enter rock, paper, or scissors: ");
            String userChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            userChoices[i] = userChoice;
            computerChoices[i] = computerChoice;
            results[i] = winner;
        }

        String[][] stats = calculateStats(results, games);

        displayResults(userChoices, computerChoices, results, stats);

        sc.close();
    }
}