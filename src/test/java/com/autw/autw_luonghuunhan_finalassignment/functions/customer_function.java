package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import com.autw.autw_luonghuunhan_finalassignment.pages.login_page;
import org.openqa.selenium.WebDriver;

public class customer_function extends basePage {
    public customer_function(WebDriver driver) {
        super(driver);
    }

    login_page loginPage = new login_page(driver);

    public void addNewCustomer(String user, String password, String email){
        common_function.sendKeys(loginPage.username,user);
        common_function.sendKeys(loginPage.password,password);
        common_function.sendKeys(loginPage.email,email);
    }

    public void edit(){
        common_function.clickToElement(loginPage.customer);
        common_function.clickToElement(loginPage.allCustomer);
        common_function.sendKeysEnter(loginPage.search,"Marie Delabre");
        common_function.clickToElement(loginPage.edit);
        common_function.driver.navigate().refresh();
        common_function.clickToElement(loginPage.accountInformation);
    }
}
