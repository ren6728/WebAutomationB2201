package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage {
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "search_query_top")
    WebElement searchBox;
    @FindBy(how = How.CLASS_NAME, using = "heading-counter")
    WebElement searchResult;
    @FindBy(how = How.LINK_TEXT, using = "Women")
    WebElement women;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Contact")
    WebElement contactus1;

    public void clickContactUs(){

        contactus1.click();
        //TestLogger.log("Clicked Contact Us Button");

        //return getPageTitle();

    }

    public String getPageTitle(){
        String pageTitle = driver.getTitle();
        // TestLogger.log("Page Title: " + pageTitle);
        return pageTitle;
    }


    public String search(){
        searchBox.sendKeys("Hello", Keys.ENTER);
        // Thread.sleep(3000);
        // Clicking Search button
        //driver.findElement(By.name("submit_search")).click();
        // Get Tag value from the specific location/tag
        String actualValue = searchResult.getText();
        System.out.println(actualValue);
        //BrowserDriver.sparkConfig();
        return actualValue;
    }

    public void womenDressDetails(){
        women.click();
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(By.linkText("Women"));
//        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/ul/li[1]/ul/li[1]/ul/li[1]/a"))).click().build().perform();
//        Thread.sleep(3000);
        // driver.findElement(By.linkText("T-shirts")).click();
    }

    public void doNothing(){
        searchBox.sendKeys("Hello", Keys.ENTER);
    }


}