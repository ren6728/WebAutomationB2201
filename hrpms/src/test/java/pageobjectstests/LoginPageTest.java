package pageobjectstests;

import browserdriver.BrowserDriver;
import excelreader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class LoginPageTest extends BrowserDriver {
   LoginPage loginPage=null;
    @BeforeMethod
    public void initializeElements(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Test
    public void loginTest(){
        loginPage.writeEmailValue("renxing201325");
        loginPage.writePasswordValue("123456");
        loginPage.clickLoginButton();
    }
    @DataProvider
    public Object[][] dataProvider() throws Exception {
        MyDataReader myDataReader = new MyDataReader();
        //Where is the excel file    /Users/renxing/WebAutomationB2201/ ///Users/jahidul/IdeaProjects/WebAutomationB2003/automationpractice/testData/testdata1.xlsx
        myDataReader.setExcelFile("/Users/renxing/WebAutomationB2201/hrpms/testData/testdata1 (1).xlsx");
        Object[][] data = myDataReader.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "dataProvider")
    public void loginPageWithoutPasswordTest(String e, String p)  {
        loginPage.writeEmailValue(e);
        loginPage.writePasswordValue(p);
        loginPage.clickLoginButton();
        String actualErrorMessage =loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "The Password field is required.");//Invalid login attempt.
        System.out.println("Test Passed......");

    }
    @DataProvider
    public Object[][] dataProvider1() throws Exception {
        MyDataReader myDataReader = new MyDataReader();
        //Where is the excel file    /Users/renxing/WebAutomationB2201/ ///Users/jahidul/IdeaProjects/WebAutomationB2003/automationpractice/testData/testdata1.xlsx
        myDataReader.setExcelFile("/Users/renxing/WebAutomationB2201/hrpms/testData/testdata2 (1).xlsx");
        Object[][] data = myDataReader.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "dataProvider1")
    public void loginPageWithInvalidCredentialTest(String e, String p)  {
        loginPage.writeEmailValue(e);
        loginPage.writePasswordValue(p);
        loginPage.clickLoginButton();
        String actualErrorMessage =loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "Invalid login attempt.");//Invalid login attempt.  The ID field is required.
        System.out.println("Test Passed......");

    }
    @DataProvider
    public Object[][] dataProvider2() throws Exception {
        MyDataReader myDataReader = new MyDataReader();
        //Where is the excel file    /Users/renxing/WebAutomationB2201/ ///Users/jahidul/IdeaProjects/WebAutomationB2003/automationpractice/testData/testdata1.xlsx
        myDataReader.setExcelFile("/Users/renxing/WebAutomationB2201/hrpms/testData/testdata3 (1).xlsx");
        Object[][] data = myDataReader.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "dataProvider2")
    public void loginPageWithoutIDTest(String e, String p)  {
        loginPage.writeEmailValue(e);
        loginPage.writePasswordValue(p);
        loginPage.clickLoginButton();
        String actualErrorMessage =loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "The ID field is required.");//Invalid login attempt.  The ID field is required.
        System.out.println("Test Passed......");

    }
}
