package com.anlov;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        System.out.println(trust(15, 1));
        posNeg(5);
        System.out.println(checkNum(-15));
        splitTime("Hi,guys!",5);
        System.out.println(leapYear(1996));
        int[] exampArray = new int[] {1,0,1,0,1,0,1};
        System.out.println(Arrays.toString(changeNum(exampArray)));
        lengthArr();
        multyArr();
        squareArr();
        System.out.println(Arrays.toString(returnArray(5,7)));
    }
    // 1 задание
    public static boolean trust(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;

    }
    // 2 задание
    public static void posNeg(int num) {
        if (num >= 0) {
            System.out.println("Вы ввели положительное число.");
        } else {
            System.out.println("Вы ввели отрицательное число.");
        }
    }
    // 3 задание
    public static boolean checkNum(int number) {
        return number < 0;

    }
    // 4 задание
    public static void splitTime(String text, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(text);
        }
    }
    // 5 задание
    public static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }
    // 6 задание
    public static int[] changeNum(int[] castArray) {
        for ( int i = 0; i < castArray.length; i++) {
            if (castArray[i] == 1) {
                castArray[i] = 0;
            } else {
                castArray[i] = 1;
            }
        }
        return castArray;
    }
    // 7 задание
    public static void lengthArr() {
        int[] array = new int[100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    // 8 задание
    public static void multyArr() {
        int[] multiplication = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < multiplication.length; i++) {
            if (multiplication[i] < 6) multiplication[i] *= 2;
        }
        System.out.println(Arrays.toString(multiplication));
    }
    // 9 задание
    public static void squareArr() {
        int count = 7;
        int[][] table = new int[count][count];
        for (int i = 0; i < count; i++) {
            table[i][i] = 1;
            table[i][(count - 1) - i] = 1;
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 10 задание
    public static int[] returnArray(int len,int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len ; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }
}