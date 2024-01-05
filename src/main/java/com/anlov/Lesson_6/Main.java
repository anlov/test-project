package com.anlov.Lesson_6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "forLesson.csv";

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{123, 223, 54}, {52, 123, 54}};

        Writer writer = new Writer(header, data);
        writer.saveFile(fileName);

        Reader.reading(fileName);
    }
}
