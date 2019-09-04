package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_MOBILE = "//div[@class=\"mbm _a4y\"]/div[@class=\"_5dbb\"]//input";
    private static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    private static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    private static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    private static final String GENDER_CUSTOMER = "u_0_a";
    private static final String GENDER_FEMALE = "u_0_8";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getWebDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement mobile = driver.findElement(By.xpath(XPATH_MOBILE));
        mobile.sendKeys("123456789");

        WebElement password = driver.findElement(By.id("u_0_q"));
        password.sendKeys("kodilla123");


        WebElement month = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(12);

        WebElement day = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(13);

        WebElement year = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1966");

        WebElement gender1 = driver.findElement(By.id(GENDER_CUSTOMER));
        gender1.click();

        WebElement gender2 = driver.findElement(By.id(GENDER_FEMALE));
        gender2.click();
    }
}
