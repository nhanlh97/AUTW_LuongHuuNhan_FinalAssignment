package com.autw.autw_luonghuunhan_finalassignment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basePage {

    public static WebDriver driver;

    public static WebDriverWait wait;

    public basePage(WebDriver driver) {
        basePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
}
