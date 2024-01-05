package com.anlov;

import java.util.ArrayList;

public class ObjectUtils {
    public static ArrayList<Cat> createArrayTestCat(int lengthArray) {
        ArrayList<Cat> catsArray = new ArrayList<Cat>();
        for(int i = 0; i < lengthArray; i++) {
            catsArray.add(createTestCat(i));
        }
        return catsArray;

    }

    public static Cat createTestCat(int numberCat) {
        return new Cat("Test_cat " + numberCat, 500,false);
    }

}
