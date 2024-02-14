package com.anlov;

import com.anlov.common.CommonActions;
import com.anlov.common.Config;
import com.anlov.pages.BaseElement;
import com.anlov.pages.BasePage;
import com.anlov.pages.BasketPage;
import com.anlov.pages.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {
    protected static WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    protected BaseElement baseElement = PageFactory.initElements(driver, BaseElement.class);

    @AfterEach
    public void quit() {
        if (Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}