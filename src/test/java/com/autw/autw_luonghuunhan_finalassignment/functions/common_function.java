package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class common_function extends basePage {

    public common_function(WebDriver driver) {
        super(driver);
    }

    public void clickToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

    }

    public void sendKeys(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    public boolean isdisplayed(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.isDisplayed();
        return false;
    }
    public void verifyTitle(String s) {
    }

    public void checkText(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
}
