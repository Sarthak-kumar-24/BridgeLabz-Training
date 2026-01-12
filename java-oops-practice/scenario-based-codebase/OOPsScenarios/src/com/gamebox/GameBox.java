package com.gamebox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * "GameBox – Mobile Game Distribution Platform"
 * 
 * Game class: title, genre, price, rating.
 * User class with list of owned games.
 * User class with list of owned games.
 * Constructors to set up free or paid games.
 * Inheritance: ArcadeGame, StrategyGame from Game.
 * Polymorphism: playDemo() behaves differently per genre.s
 * 
 */
public class GameBox {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Game> storeGames = new ArrayList<>();
        storeGames.add(new ArcadeGame("Speed Rush", 0, 4.2));
        storeGames.add(new StrategyGame("Empire Builder", 499, 4.7));

        System.out.print("Enter User Name: ");
        User user = new User(sc.nextLine());

        while (true) {
            System.out.println("\n======  GAMEBOX MENU ======");
            System.out.println("1. View Store Games");
            System.out.println("2. Play Demo");
            System.out.println("3. Buy & Download Game");
            System.out.println("4. View My Library");
            System.out.println("5. Apply Seasonal Discount");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n Available Games:");
                    for (int i = 0; i < storeGames.size(); i++) {
                        System.out.print(i + ". ");
                        storeGames.get(i).showInfo();
                    }
                    break;

                case 2:
                    System.out.print("Enter game index: ");
                    int d = sc.nextInt();
                    storeGames.get(d).playDemo();
                    break;

                case 3:
                    System.out.print("Enter game index: ");
                    int b = sc.nextInt();
                    Game g = storeGames.get(b);
                    user.buyGame(g);
                    g.download();
                    break;

                case 4:
                    user.showLibrary();
                    break;

                case 5:
                    System.out.print("Enter discount percentage: ");
                    double disc = sc.nextDouble();
                    for (Game game : storeGames)
                        game.applyDiscount(disc);
                    System.out.println(" Seasonal offer applied");
                    break;

                case 6:
                    System.out.println(" Exiting GameBox");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
