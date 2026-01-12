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
public abstract class Game implements IDownloadable{
	
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Seasonal discount using operator
    public void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void download() {
        System.out.println("⬇ Downloading " + title);
    }

    public void showInfo() {
        System.out.println(title + " | " + genre + " | Rs" + price + " | ⭐ " + rating);
    }

}
