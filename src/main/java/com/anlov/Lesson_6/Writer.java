package com.anlov.Lesson_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String[] header;
    private int[][] data;
    private String[][] strings;

    public Writer(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
        convertsIntToString();
    }

    public void convertsIntToString() {
        int lengthtoData = data.length;
        strings = new String[lengthtoData][data[0].length];
        for (int i = 0; i < lengthtoData; i++) {
            for (int j = 0; j < data[i].length; j++) {
                strings[i][j] = String.valueOf(data[i][j]);
            }
        }
    }

    public void saveFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join(";", header));
            writer.append("\n");

            for (var row : strings) {
                writer.write(String.join(";", row));
                writer.append("\n");
            }
            writer.close();
            System.out.println("Файл успешно записан");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
