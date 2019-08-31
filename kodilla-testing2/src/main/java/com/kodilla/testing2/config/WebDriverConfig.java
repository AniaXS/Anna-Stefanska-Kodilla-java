package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getWebDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "/home/ania/Selenium-drivers/Chrome/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/ania/Selenium-drivers/Firefox/geckodriver");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else {
            return null;
        }
    }
}
