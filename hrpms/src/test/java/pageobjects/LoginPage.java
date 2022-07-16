package pageobjects;

import helper.ApplicationHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "exampleInputEmail")
    WebElement emailBox;
    @FindBy(how = How.ID, using = "exampleInputPassword")
    WebElement passwordBox;
    @FindBy(how = How.CSS, using = "body > div > div > div > div > div > div > div > div > form > button")
    WebElement loginButton;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/div/div/div/form/div[1]/ul/li")
    WebElement errorMessage;

    public void writeEmailValue(String email){
        ApplicationHelper.sendKeys("EmailBox", emailBox, email);
    }

    public void writePasswordValue(String password){
        ApplicationHelper.sendKeys("PasswordBox", passwordBox, password);
    }
    public void clickLoginButton(){

        loginButton.click();

    }
    public String getErrorMessage(){

        String message =  errorMessage.getText();

        return message;

    }

}