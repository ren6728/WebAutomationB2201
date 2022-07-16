package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class HomePageTest extends BrowserDriver {
    LoginPage loginPage=null;
    HomePage homePage = null;
    @BeforeMethod
    public void initializeElements(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void getPageTitleTest(){
        loginPage.writeEmailValue("renxing201325");
        loginPage.writePasswordValue("123456");
        loginPage.clickLoginButton();
        homePage.getPageTitle();
        String actualMessage =homePage.getPageTitle();
        Assert.assertEquals(actualMessage, "Izaan Human Resource Management System");
        System.out.println("Test Passed......");
    }

}
