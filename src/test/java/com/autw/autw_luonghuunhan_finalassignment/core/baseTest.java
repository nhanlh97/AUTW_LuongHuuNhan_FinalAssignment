package com.autw.autw_luonghuunhan_finalassignment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        driver = new ChromeDriver();
        ExcelUtil.writeHeadingExcelFile("Report");
        driver.get("http://demo-acm-2.bird.eu/admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        ExcelUtil.writeDataToExcelFile("src/test/resources/AssignmentFinalTest.xlsx");
        driver.close();
    }
}
