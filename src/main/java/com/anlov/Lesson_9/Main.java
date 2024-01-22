package com.anlov.Lesson_9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(FirstEx.counterEven(numbers));

        ArrayList<String> high = new ArrayList<>();
        Collections.addAll(high, "Highload", "High", "Load", "Highload");
        System.out.println(SecondEx.countOfHigh(high));
        System.out.println(SecondEx.firstElement(high));
        System.out.println(SecondEx.lastElement(high));

        ArrayList<String> justF = new ArrayList<>();
        Collections.addAll(justF, "f10", "f15", "f2", "f4", "f4");
        System.out.println(Arrays.toString(ThirdEx.sorted(justF)));

        FourthEx example = new FourthEx();
        System.out.println(example.average());
        example.army();

        FifthEx.readLogin();


    }
}
