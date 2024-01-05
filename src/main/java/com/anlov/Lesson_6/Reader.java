package com.anlov.Lesson_6;

import java.io.*;

public class Reader {
    private Reader() {
    }

    public static void reading(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }
            reader.close();
            System.out.println("Чтение файла");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


