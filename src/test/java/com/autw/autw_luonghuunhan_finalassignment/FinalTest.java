package com.autw.autw_luonghuunhan_finalassignment;

import com.autw.autw_luonghuunhan_finalassignment.core.ExcelUtil;
import com.autw.autw_luonghuunhan_finalassignment.functions.login_function;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalTest {
    @DataProvider()
    public static Object[][] getTestData (){
        String path = "src/test/account.xlsx";
        String sheetName = "account";
        return ExcelUtil.getTableArray(path,sheetName,0,3);
    }

    @Test(dataProvider = "getTestData")
    public void tc01_ReadDataFromExcel(String email, String pass, String message){
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,pass);
    }
}
