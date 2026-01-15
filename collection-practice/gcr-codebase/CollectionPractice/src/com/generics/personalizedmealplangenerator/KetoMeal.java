package com.generics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan{
	
    @Override
    public void showMealDetails() {
        System.out.println("Keto Meal: Eggs, Avocado, Cheese, Olive Oil");
    }

}
