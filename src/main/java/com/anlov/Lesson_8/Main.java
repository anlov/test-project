package com.anlov.Lesson_8;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<String> randomWords = Arrays.asList("Dog", "Cat", "Man", "Woman", "Stepik",
                                                "Aston", "Java", "Weather", "Water", "Course",
                                                "Java", "Water", "Dog", "Cat", "Car", "Men"
        );
        System.out.println("Заданный массив : " + randomWords.toString());
        Set<String> unique = new HashSet<String>(randomWords);
        System.out.println("Массив состоит из уникальных слов, таких как: " +unique);

        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(randomWords, key));
        }

        Phonebook phonebook = new Phonebook();
        phonebook.add("Орлов", "3752922323");
        phonebook.add("Курин", "375334532321");
        phonebook.add("Махач", "375297122376");
        phonebook.add("Егоров","375297122334");
        phonebook.add("Измайлов", "375297113864");
        phonebook.add("Орлов", "3751111111");
        phonebook.add("Орлов", "375336665445");

        phonebook.get("Егоров");
        phonebook.get("Орлов");
    }
}
