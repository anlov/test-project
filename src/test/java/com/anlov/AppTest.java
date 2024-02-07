package com.anlov;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверить надписи в незаполненных полях каждого варианта оплаты услуги")
    void checkText() {
        final String SUM = "Сумма";
        final String EMAIL = "E-mail для отправки чека";
        String phoneField = getTextFromWebElement("//input[@id='connection-phone']",
                "placeholder");
        String sumField = getTextFromWebElement("//input[@id='connection-sum']",
                "placeholder");
        String emailField = getTextFromWebElement("//input[@id='connection-email']",
                "placeholder");
        assertAll(
                () -> assertEquals("Номер телефона", phoneField),
                () -> assertEquals(SUM, sumField),
                () -> assertEquals(EMAIL, emailField)
        );
        String internetField = getTextFromWebElement("//input[@id='internet-phone']",
                "placeholder");
        String internetSum = getTextFromWebElement("//input[@id='internet-sum']",
                "placeholder");
        String internetEmail = getTextFromWebElement("//input[@id='internet-email']",
                "placeholder");
        assertAll(
                () -> assertEquals("Номер абонента", internetField),
                () -> assertEquals(SUM, internetSum),
                () -> assertEquals(EMAIL, internetEmail)
        );
        String instalmentNum = getTextFromWebElement("//input[@id='score-instalment']",
                "placeholder");
        String instalmentSum = getTextFromWebElement("//input[@id='instalment-sum']",
                "placeholder");
        String instalmentEmail = getTextFromWebElement("//input[@id='instalment-email']",
                "placeholder");
        assertAll(
                () -> assertEquals("Номер счета на 44", instalmentNum),
                () -> assertEquals(SUM, instalmentSum),
                () -> assertEquals(EMAIL, instalmentEmail)
        );
        String arrearNum = getTextFromWebElement("//input[@id='score-arrears']",
                "placeholder");
        String arrearSum = getTextFromWebElement("//input[@id='arrears-sum']",
                "placeholder");
        String arrearEmail = getTextFromWebElement("//input[@id='arrears-email']",
                "placeholder");
        assertAll(
                () -> assertEquals("Номер счета на 2073", arrearNum),
                () -> assertEquals(SUM, arrearSum),
                () -> assertEquals(EMAIL, arrearEmail)
        );
    }

    @Test
    @DisplayName("Проверить корректность отображения данных")
    void checkForm() {
        final String NUMBER = "297777777";
        final double SUMMA = 25.0;
        final String SUMMA_STRING = "25";
        final String EMAIL = "aston.777@gmai.com";

        driver.findElement(By.xpath("//input[@id='connection-phone']")).sendKeys(NUMBER);
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys(SUMMA_STRING);
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//form[@id='pay-connection']/button")).click();
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        Double amount = getDoubleFromWebElement(
                "//p[@class='header__payment-amount']", " ", 0);
        String info = getTextFromWebElement(
                "//p[@class='header__payment-info']", "375", 1);
        Double sum = getDoubleFromWebElement(
                "//div[@class='card-page__card']/button", " ", 1);

        String actualNum = getTextFromWebElement("//input[@id='cc-number']/..");
        String validity = getTextFromWebElement("//input[@autocomplete='cc-exp']/..");
        String code = getTextFromWebElement("//input[@name='verification_value']/..");
        String fullName = getTextFromWebElement("//input[@autocomplete='cc-name']/..");

        List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//input[@id='cc-number']/../following-sibling::div/.//img")
        ));
        assertAll(
                () -> assertEquals(SUMMA, amount),
                () -> assertEquals(SUMMA, sum),
                () -> assertEquals(NUMBER, info),
                () -> assertEquals("Номер карты", actualNum),
                () -> assertEquals("Срок действия", validity),
                () -> assertEquals("CVC", code),
                () -> assertEquals("Имя держателя (как на карте)", fullName),
                () -> logos.forEach(p -> assertTrue(p.isDisplayed()))
        );
    }

    public String getTextFromWebElement(String xpath) {
        return driver.findElement(By.xpath(xpath))
                .getAttribute("innerText");
    }

    public String getTextFromWebElement(String xpath, String attributeName) {
        return driver.findElement(By.xpath(xpath))
                .getAttribute(attributeName);
    }

    public String getTextFromWebElement(String xpath, String regexp, int index) {
        return driver.findElement(By.xpath(xpath))
                .getAttribute("innerText")
                .split(regexp)[index];
    }

    public Double getDoubleFromWebElement(String xpath, String regexp, int index) {
        return Double.parseDouble(driver.findElement(By.xpath(xpath))
                .getAttribute("innerText")
                .split(regexp)[index]);
    }
}