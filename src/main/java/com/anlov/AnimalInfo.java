package com.anlov;

import java.awt.*;
import java.util.ArrayList;

public class AnimalInfo {
    public static void main(String[] args) {
        Dog dogSharik = new Dog("sharik", 150, false);
        System.out.println(dogSharik.isSwimming(5));
        System.out.println(dogSharik.isRunning(15));

        Cat Malish = new Cat("Malish", 500, false);
        System.out.println(Malish.isRunning(50));
        System.out.println(Malish.isSwimming(100));

        Cat Bars = new Cat("Bars", 500, false);
        System.out.println(Bars.isSwimming(10));
        System.out.println(Bars.isRunning(22));

        System.out.println(Animal.getCounter());
        System.out.println(Cat.getCounterCats());
        System.out.println(Dog.getCounterDog());

        Dishes oneDish = new Dishes(25);
        oneDish.addFood(10);
        System.out.println(oneDish.getAmountOfFoods());

        ArrayList<Cat> arrayTestCats = ObjectUtils.createArrayTestCat(5);
        for (Cat testCat : arrayTestCats) {
            System.out.println(testCat.eatFromDishes(oneDish, 15));
            System.out.println("Кот " + testCat.name + " не голоден " + testCat.getSatiety());
        }

        Figure square = new Square(Colors.GRAY, Colors.BLUE, 23);
        System.out.println(square);

        Figure triangle = new Triangle(Colors.RED, Colors.BLACK, 7, 4, 7);
        System.out.println(triangle);

        Figure circle = new Circle(Colors.BLUE,Colors.RED, 13);
        System.out.println(circle);

    }
}
