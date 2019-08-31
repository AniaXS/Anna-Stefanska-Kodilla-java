package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    private static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    private static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    private static final String GENDER = "u_0_7";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getWebDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement month = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(12);

        WebElement day = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(13);

        WebElement year = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1966");

        WebElement gender = driver.findElement(By.id(GENDER));
        gender.click();
    }
}
