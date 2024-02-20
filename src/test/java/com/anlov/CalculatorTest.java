package com.anlov;

import com.anlov.common.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest {

    protected MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    @DisplayName("Check calculator's operations")
    @ParameterizedTest
    @CsvSource({"1 + 4, 5", "8 - 3, 5", "3 * 2, 6", "9 / 3, 3"})
    public void checkOperations(String expression, String expected) {
        String actual = mainPage.takeExpress(expression).getResult();
        assertEquals(expected,actual);
    }
}
