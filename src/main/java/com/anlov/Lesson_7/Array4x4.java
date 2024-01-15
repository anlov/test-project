package com.anlov.Lesson_7;

import com.anlov.Lesson_7.Exceptions.MyArrayDataException;
import com.anlov.Lesson_7.Exceptions.MyArraySizeException;

public class Array4x4 {
    private static int sumArray;
    private final static int ARRAYSIZE = 4;

    private Array4x4() {
    }

    public static int getSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(array);

        for (int i = 0; i < ARRAYSIZE; i++) {
            for (int j = 0; j < ARRAYSIZE; j++) {
                if (!isInt(array[i][j])) {
                    throw new MyArrayDataException("Entered value isn't number", i, j);
                }
                sumArray += Integer.parseInt(array[i][j]);
            }
        }
        return sumArray;
    }

    private static void checkArraySize(String[][] array) throws MyArraySizeException {
        int rowArray = array.length;
        int columnArray = array[0].length;

        if (rowArray > ARRAYSIZE || columnArray > ARRAYSIZE) {
            throw new MyArraySizeException("Your array is larger than 4x4. Please, enter correct information",
                    rowArray, columnArray);
        }
        if (rowArray < ARRAYSIZE || columnArray < ARRAYSIZE) {
            throw new MyArraySizeException("Your array is smaller than 4x4. Please, enter correct information",
                    rowArray, columnArray);
        }
    }

    private static boolean isInt(String convert) {
        try {
            Integer.parseInt(convert);
            return true;
        } catch (NumberFormatException notInt) {
            return false;
        }
    }
}
