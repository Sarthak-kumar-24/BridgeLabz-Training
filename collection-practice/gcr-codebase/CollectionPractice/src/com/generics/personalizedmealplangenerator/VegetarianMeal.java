package com.generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {

    @Override
    public void showMealDetails() {
        System.out.println("Vegetarian Meal: Dal, Rice, Vegetables, Salad");
    }

}
