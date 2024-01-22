package com.anlov.Lesson_9;

import java.util.ArrayList;
import java.util.Collection;

public class ThirdEx {
    public static String[] sorted(ArrayList<String> sort) {
        Collection<String> sortList = sort.stream().sorted().toList();
        String[] array = new String[sortList.size()];
        sortList.toArray(array);
        return array;
    }
}
