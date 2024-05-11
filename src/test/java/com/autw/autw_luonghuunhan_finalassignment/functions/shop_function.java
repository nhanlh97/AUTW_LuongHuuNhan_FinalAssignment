package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import com.autw.autw_luonghuunhan_finalassignment.pages.shop_page;
import org.openqa.selenium.WebDriver;

public class shop_function extends basePage {
    public shop_function(WebDriver driver) {
        super(driver);
    }

    shop_page storePage = new shop_page();

    public void storeProduct() {
        common_function.clickToElement(storePage.store);
        common_function.clickToElement(storePage.product);
        common_function.isdisplayed(storePage.addNewAttributeBtn);
        common_function.isdisplayed(storePage.searchBtn);
        common_function.isdisplayed(storePage.resetFilter);
        common_function.isdisplayed(storePage.productAttributeTable);
        common_function.isdisplayed(storePage.productAttributeTable20rows);
    }

    public void storeProduct1() {
        common_function.clickToElement(storePage.store);
        common_function.clickToElement(storePage.product);
        common_function.clickToElement(storePage.addNewAttributeBtn);
        common_function.isdisplayed(storePage.defaultLabelText);
        common_function.isdisplayed(storePage.catalogInputTypeForStoreOwnerCombobox);
        common_function.isdisplayed(storePage.valuesRequiredCombobox);
    }
    public void storeProduct2() {
        common_function.clickToElement(storePage.advancedAttributeProperties);
        common_function.isdisplayed(storePage.attributeCode);
        common_function.isdisplayed(storePage.scope);
        common_function.isdisplayed(storePage.defaultValue);
        common_function.isdisplayed(storePage.uniqueValue);
        common_function.isdisplayed(storePage.inputValidationForStoreOwner);
        common_function.isdisplayed(storePage.addToColumnOptions);
        common_function.isdisplayed(storePage.useInFilterOptions);
    }

    public void storeProduct3() {
        common_function.clickToElement(storePage.store);
        common_function.clickToElement(storePage.product);
        common_function.clickToElement(storePage.addNewAttributeBtn);
        common_function.sendKeys(storePage.defaultLabelText,"honey");
        common_function.clickToElement(storePage.saveBtn);
        common_function.verifyMessage(storePage.message,"You saved the product attribute.");
    }

    public void storeProduct4(){
        common_function.clickToElement(storePage.store);
        common_function.clickToElement(storePage.product);
        common_function.sendKeysEnter(storePage.attributeCode,"color");
        common_function.verifyMessage(storePage.verifyDefaultLabel,"color");
    }
}
