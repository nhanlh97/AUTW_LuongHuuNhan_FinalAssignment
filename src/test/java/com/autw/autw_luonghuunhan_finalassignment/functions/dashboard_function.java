package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.openqa.selenium.WebDriver;

public class dashboard_function extends basePage {

    public dashboard_function(WebDriver driver){
        super(driver);
    }
    common_function commonFunction = new common_function(driver);

    public void verifyLoginSuccess(){
        commonFunction.verifyTitle("Dashboard /Magento Admin");
    }
}
