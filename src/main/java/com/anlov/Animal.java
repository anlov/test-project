package com.anlov;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Animal {
    String name;
    protected int length;
    private static int counter;
    private Boolean satiety = false;
    Boolean isEatFromDishes = false;

    public Animal(String name, int length, boolean isEatFromDishes) {
        this.name = name;
        this.length = length;
        this.isEatFromDishes = isEatFromDishes;
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public String  isSwimming(int length) {
        return name + " swam " + length;
    }

    public String  isRunning(int length) {
        return name + " ran " + length;
    }

    public String eatFromDishes(Dishes dishOfFood, int isHungry) {
        if (dishOfFood.getAmountOfFoods() < isHungry) {
            return "Животному " + this.name + " мало еды.";
        } else {
            dishOfFood.setAmountOfFoods(dishOfFood.getAmountOfFoods() - isHungry);
            setSatiety(true);
            return "Животное " + this.name + " покушал";
        }
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    public Boolean getSatiety() {
        return satiety;
    }
}