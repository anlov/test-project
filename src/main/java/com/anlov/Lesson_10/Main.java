package com.anlov.Lesson_10;

public class Main {
    public static void main(String[] args) {
        double weightApple = 1;
        double weightOrange = 1.5;

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(weightOrange), 7);
        System.out.println(orangeBox.getBoxWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(weightApple), 7);
        System.out.println(appleBox.getBoxWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple(weightApple), 8);
        System.out.println(appleBox2.getBoxWeight());

        System.out.println(appleBox.compare(appleBox2));

        appleBox2.exchange(appleBox);
        System.out.println(appleBox.getBoxWeight());
        System.out.println(appleBox2.getBoxWeight());

    }
}
