package com.gamebox;

import java.util.ArrayList;
import java.util.List;

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
public class User {
	
    private String name;
    private List<Game> ownedGames = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    // Encapsulation: controlled purchase
    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println( game.getTitle() + " added to your library");
    }

    public void showLibrary() {
        System.out.println("\n"+name + "'s Game Library");
        if (ownedGames.isEmpty()) {
            System.out.println("No games owned");
            return;
        }

        for (Game g : ownedGames) {
            g.showInfo();
        }
    }

}
