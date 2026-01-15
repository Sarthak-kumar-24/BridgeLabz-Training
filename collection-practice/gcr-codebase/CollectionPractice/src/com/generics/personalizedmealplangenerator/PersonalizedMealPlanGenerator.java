package com.generics.personalizedmealplangenerator;

/**
 * PersonalizedMealPlanGenerator demonstrates:
 * - Generic classes
 * - Generic methods
 * - Bounded type parameters
 */
public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {

        // Creating different meal plans
        Meal<VegetarianMeal> vegMeal =  new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        // Generating meal plans
        MealGenerator.generateMeal(vegMeal);
        System.out.println();

        MealGenerator.generateMeal(veganMeal);
        System.out.println();

        MealGenerator.generateMeal(ketoMeal);
        System.out.println();

        MealGenerator.generateMeal(proteinMeal);
    }

}
