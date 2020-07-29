package com.testinium.sample.gg.test.page;

import com.testinium.sample.gg.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.gittigidiyor.com");
    }


}
