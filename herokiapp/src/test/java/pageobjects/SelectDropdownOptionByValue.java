package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class SelectDropdownOptionByValue {

    public String selectDropDownOptionByValue(WebDriver driver, String value) {
        System.out.println("In Dropdown Page");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByValue(value);
        String actualMessage = select.getFirstSelectedOption().getText();
      //  body > div:nth-child(1)
        return actualMessage;

    }
}
