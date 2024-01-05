package com.anlov;

public class Dishes {
    private int amountOfFoods;

    public Dishes(int amountOfFoods) {
        this.amountOfFoods = Math.max(amountOfFoods, 0);
    }

    public void addFood(int addFood) {
        if (addFood > 0) {
            this.amountOfFoods += addFood;
        } else {
            System.out.println("Некорректное значение.");
        }
    }

    public int getAmountOfFoods() {
        return amountOfFoods;
    }

    public void setAmountOfFoods(int amountOfFoods) {
        this.amountOfFoods = amountOfFoods;
    }

    public void deleteAllFoodFromDish() {
        this.amountOfFoods = 0;
    }
}

