package com.autw.autw_luonghuunhan_finalassignment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://demo-acm-2.bird.eu/admin");

    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
