package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By email = By.id("email");
    private By btnRetrieve = By.cssSelector("#form_submit > i");

    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    public SecureForgotPage FillInEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(btnRetrieve).click();
        return new SecureForgotPage(driver);
    }



}
