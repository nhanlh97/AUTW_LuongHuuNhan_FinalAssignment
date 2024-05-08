package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class common_function extends basePage {
    public common_function(WebDriver driver) {
        super(driver);
    }

    public void clickToElement(By locator){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

    }
    public void sendKeyToElement(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys();
    }
    public void switchToWindowByIndex (int index){
        ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(index));
    }
    public void switchToWindowByTitle (String title){
        for(String windowID: driver.getWindowHandles()){
            String getTitle = driver.switchTo().window(windowID).getTitle();
            if (getTitle.equals(title)){
                driver.switchTo().window(windowID);
                break;
            }
        }
    }
}
