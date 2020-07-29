package com.testinium.sample.gg.test.base;

import com.testinium.sample.gg.test.page.HomePage;
import com.testinium.sample.gg.test.page.LoginPage;
import com.testinium.sample.gg.test.page.ProductListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public ProductListPage search(String keyword){
        setById("search_word", keyword);
        clickById("header-search-find-link");

        return new ProductListPage(driver);

    }

    public LoginPage callLoginPage(){
        clickByClassname("profile-name");
        return new LoginPage(driver);
    }

    public HomePage callHomePage(){
        driver.get("https://www.gittigidiyor.com");
        return new HomePage(driver);
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

    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@id, 'item-info-block')]"))));
    }
}
