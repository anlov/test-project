package com.anlov.Lesson_7.Exceptions;

public class MyArrayDataException extends Exception{
    private final int rowArrayIndex;
    private final int columnArrayIndex;

    public MyArrayDataException(String info, int rowArrayIndex, int columnArrayIndex) {
        super(info);
        this.rowArrayIndex = rowArrayIndex;
        this.columnArrayIndex = columnArrayIndex;
    }

    public String getArrayIndex() {
        return "[" + rowArrayIndex + "]" + "[" + columnArrayIndex + "]";
    }
}
