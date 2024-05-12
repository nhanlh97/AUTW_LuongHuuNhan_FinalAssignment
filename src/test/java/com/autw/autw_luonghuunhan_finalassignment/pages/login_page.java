package com.autw.autw_luonghuunhan_finalassignment.pages;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page extends basePage {

    public By username = By.name("login[username]");

    public By password = By.name("login[password]");

    public By signINBtn = By.xpath("//button/span[contains(text(),'Sign in')]");

    public By forgotYourPassword = By.linkText(" Forgot your password");

    public By customer = By.xpath("//a/span[contains(text(),'Customers')]");

    public By allCustomer = By.xpath("//a/span[contains(text(),'All Customers')]");

    public By addNewCustomer = By.xpath("//button/span[contains(text(),'Add New Customer')]");

    public By firstName = By.name("customer[firstname]");

    public By lastName = By.name("customer[lastname]");

    public By email = By.name("customer[email]");

    public By SaveCustomer = By.id("save");

    public By message = By.xpath("//div[@id='messages']/div/div/div");

    public By search = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/input");

    public By edit = By.xpath("//tr[@class='data-row']/td[17]/a");

    public By accountInformation = By.linkText("Account Information");

    public login_page(WebDriver driver) {
        super(driver);
    }
}
