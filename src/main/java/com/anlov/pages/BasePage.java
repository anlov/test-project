package com.anlov.pages;

import com.anlov.constants.Attribute;
import com.anlov.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }
    public WebElement waitElementVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitAttribute(WebElement element, Attribute attribute, String str) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeoutVariable.EXPLICIT_WAIT))
                .until(ExpectedConditions.attributeToBe(element, attribute.toString(), str));
        return element;
    }
}
