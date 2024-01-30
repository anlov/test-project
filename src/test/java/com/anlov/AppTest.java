package com.anlov;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @DataProvider(name = "info")
    public Integer[][] info() {
        return new Integer[][]{{0, 1}, {4, 24}, {5, 120}, {6, 720}};
    }

    @Test(dataProvider = "info", testName = "Рассчёт факториала")
    public void factorial(int num, long expected) {
        Assert.assertEquals(expected, App.factorial(num));
    }
}