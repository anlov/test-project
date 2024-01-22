package com.anlov.Lesson_9;

import static java.util.Arrays.stream;

public class FirstEx {
    public static long counterEven(int[] num) {
        return stream(num).filter(n -> n % 2 == 0).count();
    }
}
