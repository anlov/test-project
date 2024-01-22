package com.anlov.Lesson_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FifthEx {
    private static final Collection<String> userLogin = new ArrayList<>();

    public static void readLogin() {
        boolean trust = true;
        while (trust) {
            Scanner read = new Scanner(System.in);
            System.out.println("Your login: ");
            String login = read.nextLine();
            trust = !login.equals(" ") && !login.isEmpty() && userLogin.add(login);
        }
        userLogin.stream().filter(s -> s.startsWith("f")).forEach(System.out::println);
    }
}
