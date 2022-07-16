package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.FileUploadPage;
import pageobjects.HomePage;
import pageobjects.SelectDropdownOptionByValue;

public class DropdownOptionTest extends BrowserDriver{
    HomePage homePage = null;
    SelectDropdownOptionByValue dropdownPage= null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        dropdownPage = PageFactory.initElements(driver, SelectDropdownOptionByValue.class);
    }
    @Test
    public void selectDropdownOptionTest(String value){

        homePage.goToDropDownPage();
        //selectDropdownOptionTest(driver,"1");
        String actualMessage=dropdownPage.selectDropDownOptionByValue(driver,value);
        Assert.assertEquals(actualMessage, "Option 1");






    }

}
