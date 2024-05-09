package com.autw.autw_luonghuunhan_finalassignment.pages;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page extends basePage {
    public By username= By.name("login[username]") ;

    public By password =By.name("login[password]");

    public By signINBtn = By.xpath("//button/span[contains(text(),'Sign in')]");

    public By forgotYourPassword = By.linkText(" Forgot your password");

    public login_page(WebDriver driver) {
        super(driver);
    }
}
