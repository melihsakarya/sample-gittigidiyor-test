package com.testinium.sample.gg.test.page;

import com.testinium.sample.gg.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String username, String password){
        setById("L-UserNameField", username);
        setById("L-PasswordField", password);
        clickById("gg-login-enter");
        return new HomePage(driver);
    }
    //fluently pattern
}
//button[text() = 'Giriş']