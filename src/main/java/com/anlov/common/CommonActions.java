package com.anlov.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.anlov.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (Config.BROWSER) {
            case "win_chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "win_firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "win_edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                Assertions.fail("Wrong browser's name:" + Config.BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
        return driver;
    }
}
