package com.anlov;

public class Dog extends Animal {
    private static int counterDog;

    public Dog(String name, int length, boolean isEatFromDishes) {
        super(name, length, isEatFromDishes);
        ++counterDog;
    }

    @Override
    public String isRunning(int length) {
        if (length < 500) {
            return super.isRunning(length);
        } else {
          return ("Dogs can't run more than 500 meters");
        }
    }

    @Override
    public String isSwimming(int length) {
        if (length < 10) {
            return super.isSwimming(length);
        } else {
            return ("Dogs can't swim more than 10 meters");
        }
    }

    public static int getCounterDog() {
        return counterDog;
    }
}
