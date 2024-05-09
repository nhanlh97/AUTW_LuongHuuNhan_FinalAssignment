package com.autw.autw_luonghuunhan_finalassignment;

import com.autw.autw_luonghuunhan_finalassignment.core.ExcelUtil;
import com.autw.autw_luonghuunhan_finalassignment.core.baseTest;
import com.autw.autw_luonghuunhan_finalassignment.functions.dashboard_function;
import com.autw.autw_luonghuunhan_finalassignment.functions.login_function;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalTest extends baseTest{

    @DataProvider
    public  static Object[][] getAccountData(){
        String path = "src/Source/accountData.xlsx";
        String sheetName = "account";
        return  ExcelUtil.getTableArray(path, sheetName,0,2);
    }

    @Test(dataProvider = "getAccountData")
    public void tc01_VerifyLoginPage(String user, String pass){
        login_function loginFunction = new login_function(driver);
        dashboard_function dashboardFunction = new dashboard_function(driver);
        try {
            loginFunction.verifyLoginPage();
            loginFunction.login(user, pass);
            dashboardFunction.verifyLoginSuccess();
            Assert.assertEquals(2, 3);
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Pass");
        }catch (Exception e){
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Failed");
        }catch (AssertionError a){
            ExcelUtil.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass",  String.valueOf(a));
        }
    }
}
