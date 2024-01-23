package com.anlov.Lesson_10;

public class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }
}

class Orange extends Fruit {
    public Orange(double weight) {
        super(weight);
    }
}
