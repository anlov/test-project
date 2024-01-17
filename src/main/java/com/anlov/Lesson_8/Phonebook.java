package com.anlov.Lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String lastname, String number) {
        if (book.containsKey(lastname)) {
            List<String> num = book.get(lastname);
            if (!num.contains(number)) {
                num.add(number);
                System.out.printf("Номер %s добавлен для абонента %s \n", number, lastname);
            } else {
                System.out.printf("Данный номер %s уже используется абонентом %s ", number, lastname);
            }
        } else {
            book.put(lastname, new ArrayList<>(Arrays.asList(number)));
            System.out.printf("Номер %s добавлен абоненту %s \n", number, lastname);
        }
    }
    public void get(String lastname) {
        if (book.containsKey(lastname)) {
            System.out.printf("Номер для абонента %s : %s\n",lastname, book.get(lastname));
        } else {
            System.out.printf("Пользователя с фамилией %s, не существует ", lastname);
            System.out.println(" ");
        }
    }
}