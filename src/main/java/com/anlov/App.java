package com.anlov;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(factorial(6) );
    }

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Факториал рассчитывается только для положительных чисел");
        } else if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
