package com.anlov.Lesson_10;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {

    private  final ArrayList<T> nameOfFruits = new ArrayList<>();

    public void add(T fruits, int count) {
        for (int i = 0; i < count; i++) {
            nameOfFruits.add(fruits);
        }
    }

    public double getBoxWeight() {
        return nameOfFruits.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(Box<?> fruitsWeight) {
        return this.getBoxWeight() == fruitsWeight.getBoxWeight();
    }

    public void exchange(Box<T> newBox) {
        newBox.nameOfFruits.addAll(this.nameOfFruits);
        this.nameOfFruits.clear();
    }
}
