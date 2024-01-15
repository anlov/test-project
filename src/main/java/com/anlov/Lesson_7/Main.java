package com.anlov.Lesson_7;

import com.anlov.Lesson_7.Exceptions.MyArraySizeException;
import com.anlov.Lesson_7.Exceptions.MyArrayDataException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"14", "23", "21", "2"},
                {"15", "23", "0", "23"},
                {"32", "12", "5", "100"},
                {"32", "12", "5", "L"}};



        try {
            System.out.println(Array4x4.getSumArray(array));
        } catch (MyArraySizeException size) {
            System.out.println(size.getMessage() + ", entered array is " + size.getArraySize());
        } catch (MyArrayDataException data) {
            System.out.println(data.getMessage() + " " + data.getArrayIndex());
        }
    }
}
