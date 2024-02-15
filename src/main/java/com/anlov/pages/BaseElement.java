package com.anlov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseElement {
    protected WebDriver driver;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
    }

    public static class Basket {
        private static final By basketLoc = By
                .xpath("//div[@id='basketContent']/.//a[@href='/lk/basket']");
    }

    public BaseElement clickBasket() {
        driver.findElement(Basket.basketLoc).click();
        return this;
    }
}
