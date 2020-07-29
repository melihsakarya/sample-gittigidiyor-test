package com.testinium.sample.gg.test.page;

import com.testinium.sample.gg.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password){
        clickByClassname("profile-name");
        setById("L-UserNameField", username);
        setById("L-PasswordField", password);
        clickById("gg-login-enter");
    }
}
