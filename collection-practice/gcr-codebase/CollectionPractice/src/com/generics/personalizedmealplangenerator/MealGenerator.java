package com.generics.personalizedmealplangenerator;

public class MealGenerator {

	/**
	 * Generic method to generate a meal plan. Ensures only valid meal types are
	 * allowed.
	 */
	public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
		System.out.println("Generating Personalized Meal Plan...");
		meal.getMealPlan().showMealDetails();
	}

}
