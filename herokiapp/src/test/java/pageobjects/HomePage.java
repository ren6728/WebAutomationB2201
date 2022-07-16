package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage  {
    WebDriver driver = null;
    @FindBy(how = How.LINK_TEXT, using = "File Upload")
    WebElement fileUploadLink;
    @FindBy (how = How.LINK_TEXT, using = "Dropdown")
    WebElement dropDown;

    public void clickFileUploadLink(){
        fileUploadLink.click();
        // String uploadPageTitle = driver.getTitle();
        // TestLogger.log("Upload Page Title: " + uploadPageTitle);
    }
    public void goToDropDownPage() {
        dropDown.click();

    }

}

