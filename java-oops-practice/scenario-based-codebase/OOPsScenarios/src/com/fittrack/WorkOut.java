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
abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    
    private String workoutLog = "Workout started";

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    protected abstract void calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        workoutLog = "Workout in progress";
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        workoutLog = "Workout completed";
        System.out.println(type + " workout stopped");
    }
}

