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
class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    protected void calculateCalories() {
        caloriesBurned = duration * 6;
    }
}
