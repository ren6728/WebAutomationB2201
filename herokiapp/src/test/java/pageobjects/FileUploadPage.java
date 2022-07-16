package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FileUploadPage {
    WebDriver driver = null;
    @FindBy(how = How.ID, using = "file-upload")
    WebElement choseFileButton;

    @FindBy(how = How.ID, using = "file-submit")
    WebElement fileUploadButton;

    @FindBy(how = How.TAG_NAME, using = "h3")
    WebElement uploadMessage;

    public String uploadFile(){
        choseFileButton.sendKeys("/Users/renxing/WebAutomationB2201/herokiapp/data/lambda.png");
        fileUploadButton.click();
        String actualMessage = uploadMessage.getText();
        return actualMessage;

    }
}