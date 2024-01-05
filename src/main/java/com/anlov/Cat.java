package com.anlov;

public class Cat extends Animal {
    private static int counterCats;

    public Cat(String name, int length, boolean isEatFromDishes) {
        super(name, length,isEatFromDishes);
        ++counterCats;
    }

    @Override
    public String isSwimming(int length) {
        return "Cats can't swim";
    }

    @Override
    public String isRunning(int length) {
        if (length > 200) {
            return "Cats can run more than 200 meters";
        } else {
            return super.isRunning(length);
        }
    }

    public static int getCounterCats() {
        return counterCats;
    }
}
