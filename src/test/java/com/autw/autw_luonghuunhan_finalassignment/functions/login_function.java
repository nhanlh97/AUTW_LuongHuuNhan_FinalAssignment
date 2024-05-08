package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import com.autw.autw_luonghuunhan_finalassignment.pages.login_page;
import org.openqa.selenium.WebDriver;

public class login_function extends basePage {
    public login_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function (driver);
    login_page loginPage = new login_page();
    public void login(String email, String pass ){
        commonFunction.sendKeyToElement(loginPage.email,email);
        commonFunction.sendKeyToElement(loginPage.pass, pass);
        commonFunction.clickToElement(loginPage.buttonLogin);
    }
}
