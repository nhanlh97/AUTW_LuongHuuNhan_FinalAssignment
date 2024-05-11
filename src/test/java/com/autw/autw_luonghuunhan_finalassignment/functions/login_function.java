package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import com.autw.autw_luonghuunhan_finalassignment.pages.login_page;
import org.openqa.selenium.WebDriver;

public class login_function extends basePage {

    public login_function(WebDriver driver) {
        super(driver);
    }

    common_function commonFunction = new common_function (driver);

    login_page loginPage = new login_page(driver);

    public void login(String user, String password) {
        commonFunction.sendKeys(loginPage.username, user);
        commonFunction.sendKeys(loginPage.password, password);
        commonFunction.clickToElement(loginPage.signINBtn);
    }

    public void verifyLoginPage(){
        commonFunction.isdisplayed(loginPage.username);
        commonFunction.isdisplayed(loginPage.password);
        commonFunction.isdisplayed(loginPage.signINBtn);
        commonFunction.isdisplayed(loginPage.forgotYourPassword);
    }

    public void verifyLoginSuccess(String value) {
        dashboard_function.checkTitle(value);
    }

    public void add(String firstName, String lastName, String email) {
        common_function.clickToElement(loginPage.customer);
        common_function.clickToElement(loginPage.allCustomer);
        common_function.clickToElement(loginPage.addNewCustomer);
        common_function.driver.navigate().refresh();
        common_function.sendKeys(loginPage.firstName, firstName);
        common_function.sendKeys(loginPage.lastName, lastName);
        common_function.sendKeys(loginPage.email, email);
        common_function.clickToElement(loginPage.SaveCustomer);
        common_function.verifyMessage(loginPage.message,"You saved the customer.");

    }
}
