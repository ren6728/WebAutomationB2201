package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomePageTest extends BrowserDriver {
    HomePage homePage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void searchTest(){
        String actualText = homePage.search();
        Assert.assertEquals(actualText, "0 results have been found.");
    }

//    @Test(invocationCount = 0)
//    public void womenDressDetailsTest(){
//        homePage.womenDressDetails();
//    }

}
