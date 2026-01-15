package com.generics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan{

    @Override
    public void showMealDetails() {
        System.out.println("High-Protein Meal: Chicken, Beans, Paneer, Yogurt");
    }
}
