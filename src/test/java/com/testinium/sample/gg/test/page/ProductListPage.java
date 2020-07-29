package com.testinium.sample.gg.test.page;

import com.testinium.sample.gg.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends BasePage {
    public ProductListPage(WebDriver driver) {
        super(driver);
    }


    public void selectProductByIndex(Integer index){
        //driver.findElements(By.className("catalog-seem-cell")).get(index).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getElementsByXpath("//*[contains(@id, 'item-info-block')]").get(index).click();

    }



}
