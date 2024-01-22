package com.anlov.Lesson_9;

import java.util.ArrayList;

public class SecondEx {
    public static long countOfHigh(ArrayList<String> arrayList) {
        return arrayList.stream().filter(p -> p.equals("High")).count();
    }
    public static String firstElement(ArrayList<String> arrayList) {
        return arrayList.stream().findFirst().orElse("0");
    }
    public static String lastElement(ArrayList<String> arrayList) {
        return arrayList.stream().skip(arrayList.size() - 1).findFirst().orElse("0");
    }
}
