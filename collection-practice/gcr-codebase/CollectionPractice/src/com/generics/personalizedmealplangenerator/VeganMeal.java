package com.generics.personalizedmealplangenerator;

public class VeganMeal  implements MealPlan {

    @Override
    public void showMealDetails() {
        System.out.println("Vegan Meal: Quinoa, Lentils, Fruits, Nuts");
    }

}
