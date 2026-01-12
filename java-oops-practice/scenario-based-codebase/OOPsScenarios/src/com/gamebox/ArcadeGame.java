package com.gamebox;

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
public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public void playDemo() {
        System.out.println(" Playing fast-paced arcade demo of " + title);
    }

}
