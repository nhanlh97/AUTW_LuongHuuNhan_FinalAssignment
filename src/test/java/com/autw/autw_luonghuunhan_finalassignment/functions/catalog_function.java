package com.autw.autw_luonghuunhan_finalassignment.functions;

import com.autw.autw_luonghuunhan_finalassignment.core.basePage;
import com.autw.autw_luonghuunhan_finalassignment.pages.catalog_page;
import org.openqa.selenium.WebDriver;

public class catalog_function extends basePage {

    public catalog_function(WebDriver driver) {
        super(driver);
    }

    catalog_page catalogPage = new catalog_page(driver);

    public void catalogProduct() {
        common_function.clickToElement(catalogPage.catalog);
        common_function.clickToElement(catalogPage.product);
        common_function.isdisplayed(catalogPage.addProductBtn);
        common_function.isdisplayed(catalogPage.searchKey);
        common_function.isdisplayed(catalogPage.filtersBtn);
        common_function.isdisplayed(catalogPage.newView);
        common_function.isdisplayed(catalogPage.columns);
        common_function.isdisplayed(catalogPage.tableListOutProduct);
    }
    public void catalogProduct1() {
        common_function.clickToElement(catalogPage.catalog);
        common_function.clickToElement(catalogPage.product);
        common_function.sendKeysEnter(catalogPage.search1,"Joust Duffle Bag");
        common_function.clickToElement(catalogPage.edit);
        common_function.isdisplayed(catalogPage.productName);
    }
    public void catalogProduct2() {
        common_function.clickToElement(catalogPage.catalog);
        common_function.clickToElement(catalogPage.product);
        common_function.sendKeysEnter(catalogPage.search1,"Joust Duffle Bag");
        common_function.clickToElement(catalogPage.edit);
        common_function.isdisplayed(catalogPage.productName);
        common_function.isdisplayed(catalogPage.price);
        common_function.isdisplayed(catalogPage.attributeSet);
    }
}
