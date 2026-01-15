package com.generics.personalizedmealplangenerator;

/**
 * Meal is a generic class that handles
 * different types of meal plans safely.
 *
 * Bounded Type Parameter:
 * T must implement MealPlan
 */
public class Meal<T extends MealPlan>  {
	
    private T mealPlan;

    
    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    
    T getMealPlan() {
        return mealPlan;
    }

}
