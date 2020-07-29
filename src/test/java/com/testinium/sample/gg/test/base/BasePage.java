package com.testinium.sample.gg.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void search(String keyword){
        setById("search_word", keyword);
        clickById("header-search-find-link");

    }

    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }

    public void clickByClassname(String classname){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        driver.findElement(By.className(classname)).click();
    }
}
