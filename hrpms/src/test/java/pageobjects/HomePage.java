package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver = null;
    //LoginPage loginPage=null;

    @FindBy(how = How.CSS, using = "body > nav > span")
    WebElement homePageTitle;
    @FindBy(how = How.ID, using = "dashboard")
    WebElement dashBoard;

    public String getPageTitle(){

        String pageTitle = driver.getTitle();
        TestLogger.log("Page Title: " + pageTitle);
        return pageTitle;
    }
    public void clickDashBoard(){
        dashBoard.click();

    }

}
