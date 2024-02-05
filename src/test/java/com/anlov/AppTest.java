package com.anlov;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

public class AppTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверить название блока")
    void checkBlockName() {
        WebElement nameOfBlogs = driver.findElement(By.xpath
                ("//div[@class='pay__wrapper']/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", nameOfBlogs.getText());
    }

    @Test
    @DisplayName("Проверить наличие логотипов платёжных систем")
    void checkLogos() {
        List<WebElement> logos = driver.findElements(By.xpath
                ("//div[@class='pay__partners']/ul/li/img"));
        logos.forEach(l -> assertTrue(l.isDisplayed(), l.getAttribute("alt")));

    }

    @Test
    @DisplayName("Проверить работу ссылки -'Подробнее о сервисе'")
    void checkLink() {
        String link = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        WebElement linkCheck = driver.findElement(By.xpath
                ("//div[@class='pay__wrapper']/a"));
        assertTrue(linkCheck.isEnabled());
        assertTrue(linkCheck.isDisplayed());
        String linkAttribute = linkCheck.getAttribute("href");
        driver.get(linkAttribute);
        assertEquals(link, linkAttribute);
    }

    @Test
    @DisplayName("Проверить заполнение полей и работу кнопки 'Продолжить'")
    void checkContinue() {
        final String NUMBER = "297777777";
        final String SUMMA = "25";
        final String EMAIL = "aston.777@gmai.com";
        driver.findElement(By.xpath("//input[@id='connection-phone']")).sendKeys(NUMBER);
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(SUMMA);
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//form[@id='pay-connection']/button")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);
        WebElement payContinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//div[@class='app-wrapper__content']")));

        assertTrue(payContinue.isDisplayed());
    }
}