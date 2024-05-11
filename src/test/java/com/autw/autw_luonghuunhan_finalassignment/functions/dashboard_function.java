package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class dashboard_function extends basePage {

    public dashboard_function(WebDriver driver){
        super(driver);
    }
    common_function commonFunctions = new common_function(driver);
    public static void checkTitle(String value) {
        String title = driver.getTitle();
        Assert.assertEquals(title, value);
    }
    public void verifyLoginSuccess(){
        commonFunctions.verifyTitle("Dashboard /Magento Admin");
    }
}
