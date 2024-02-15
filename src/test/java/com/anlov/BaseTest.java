package com.anlov;

import com.anlov.common.CommonActions;
import com.anlov.common.Config;
import com.anlov.pages.BaseElement;
import com.anlov.pages.BasePage;
import com.anlov.pages.BasketPage;
import com.anlov.pages.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected static WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = PageFactory.initElements(driver, BasePage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);
    protected BaseElement baseElement = PageFactory.initElements(driver, BaseElement.class);

    protected SoftAssert softAssert = new SoftAssert();

    @AfterSuite(alwaysRun = true)
    public void quit() {
        if (Config.QUIT_BROWSER) {
            driver.quit();
        }
    }
}