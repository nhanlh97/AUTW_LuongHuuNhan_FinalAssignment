package com.autw.autw_luonghuunhan_finalassignment;

import com.autw.autw_luonghuunhan_finalassignment.core.ExcelUtil;
import com.autw.autw_luonghuunhan_finalassignment.core.baseTest;
import com.autw.autw_luonghuunhan_finalassignment.functions.*;
import com.autw.autw_luonghuunhan_finalassignment.pages.login_page;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalTest extends baseTest{
    @DataProvider
    public  static Object[][] getAccountData(){
        String path = "src/test/resources/AssignmentFinalTest.xlsx";
        String sheetName = "account";
        return  ExcelUtil.getTableArray(path, sheetName,0,2);
    }
    @DataProvider
    public  static Object[][] CustomerData(){
        String path = "src/test/resources/AssignmentFinalTest.xlsx";
        String sheetName = "account2";
        return  ExcelUtil.getTableArray(path, sheetName,0,5);
    }


    @Test(dataProvider = "getAccountData")
    public void tc01_VerifyLoginPage(String user, String pass){
        login_function loginFunctions = new login_function(driver);
        dashboard_function dashboardFunctions = new dashboard_function(driver);
        try {
            loginFunctions.verifyLoginPage();
            loginFunctions.login(user, pass);
            dashboardFunctions.verifyLoginSuccess();
            Assert.assertEquals(2, 3);
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Pass");
        }catch (Exception e){
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Failed");
        }catch (AssertionError a){
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass",  String.valueOf(a));
        }
    }
    @Test(priority = 2, dataProvider = "CustomerData")
    public void tc02_VerifyCreateNewCustomer(String user, String pass, String lastname, String firstname, String email){
        login_function loginFunctions = new login_function(driver);

        loginFunctions.login(user,pass);
        loginFunctions.add(firstname, lastname, email);
        customer_function customerFunction = new customer_function(driver);

    }
    @Test(priority = 3,dataProvider = "getAccountData")
    public void tc03_VerifyEditCustomer(String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        customer_function customerFunctions = new customer_function(driver);
        customerFunctions.edit();

        login_page loginPage = new login_page(driver);
        common_function.verifyMessage(loginPage.firstName,"Marie");
        common_function.verifyMessage(loginPage.lastName,"Delabre");

    }

    @Test(dataProvider = "getAccountData")
    public void tc04_VerifyProductPage (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        catalog_function catalogFunctions = new catalog_function(driver);
        catalogFunctions.catalogProduct();
    }

    @Test(dataProvider = "getAccountData")
    public void tc05_VerifySearchProductPage (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        catalog_function catalogFunctions = new catalog_function(driver);
        catalogFunctions.catalogProduct1();
    }
    @Test(dataProvider = "getAccountData")
    public void tc06_VerifySearchProductPage (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        catalog_function catalogFunctions = new catalog_function(driver);
        catalogFunctions.catalogProduct2();
    }

    @Test(dataProvider = "getAccountData")
    public void tc07_VerifyProductAttributesPage (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        shop_function storeFunctions = new shop_function(driver);
        storeFunctions.storeProduct();
    }
    @Test(dataProvider = "getAccountData")
    public void tc08_VerifyAddNewProductAttributesPage (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        shop_function storeFunctions = new shop_function(driver);
        storeFunctions.storeProduct1();
        storeFunctions.storeProduct2();
    }

    @Test(dataProvider = "getAccountData")
    public void tc09_VerifyCreateNewProductAttributesSuccessfully (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        shop_function storeFunctions = new shop_function(driver);
        storeFunctions.storeProduct3();

    }

    @Test(dataProvider = "getAccountData")
    public void VerifySearchProductAttributes (String user, String pass){
        login_function loginFunctions = new login_function(driver);
        loginFunctions.login(user,pass);

        shop_function storeFunctions = new shop_function(driver);
        storeFunctions.storeProduct4();

    }
}
