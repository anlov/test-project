package com.anlov;
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");

    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = 97;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers() {
        int a = 77;
        int b = 78;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}