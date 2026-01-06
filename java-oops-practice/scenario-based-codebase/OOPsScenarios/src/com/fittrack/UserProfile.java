package com.fittrack;


/*  FitTrack – Your Personal Fitness Tracker
 * 
 *  You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
 *  workouts, calories, and daily progress.
 *  
 *  UserProfile class with fields like name, age, weight, goal.
 *  Workout class to track type, duration, caloriesBurned.
 *  Constructors to allow user creation with default or custom goals.
 *  ITrackable interface with startWorkout() and stopWorkout() methods.
 *  Inheritance: CardioWorkout, StrengthWorkout extend Workout.
 *  Polymorphism: calculateCalories() differs by workout type.
 * 
 */
public class UserProfile {

    private String name;
    private int age;
    private double weight;   // protected health data
    private int dailyGoal;   // calories

    
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    
    public UserProfile(String name, int age, double weight, int dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
    }

    public int calculateProgress(int caloriesBurned) {
        return dailyGoal - caloriesBurned;   
    }

    public String getName() {
        return name;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }
    
    static void header(String title) {
        System.out.println("\n==============================");
        System.out.println(" " + title.toUpperCase());
        System.out.println("==============================");
    }

    static void row(String key, Object value) {
        System.out.printf("%-20s : %s%n", key, value);
    }
    
    
    public static void main(String[] args) {

        header("FitTrack Dashboard");

        UserProfile user = new UserProfile("Sarthak", 21, 68.5, 2200);

        row("User", user.getName());
        row("Daily Goal", user.getDailyGoal() + " kcal");

        // Workout selection
        Workout workout = new CardioWorkout(45);

        header("Workout Session");

        workout.startWorkout();
        workout.calculateCalories();
        

        int burned = workout.getCaloriesBurned();
        int remaining = user.calculateProgress(burned);

        row("Workout Type", workout.type);
        row("Duration", "45 minutes");
        row("Calories Burned", burned + " kcal");
        row("Calories Remaining", remaining + " kcal");
        workout.stopWorkout();

        header("Session Completed");
    }
}

