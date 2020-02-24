package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureForgotPage {
    private WebDriver driver;
    private By msg = By.cssSelector("#content");

    public SecureForgotPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertMsg(){
        return driver.findElement(msg).getText();
    }
}
