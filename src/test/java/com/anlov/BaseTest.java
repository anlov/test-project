package com.anlov;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import com.anlov.common.InstanceDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    protected static AndroidDriver<AndroidElement> driver;

    @BeforeAll
    public static void setup() {
        driver = InstanceDriver.getDriver();
    }

    @AfterAll
    public static void teardown() {
        InstanceDriver.quit();
    }
}
