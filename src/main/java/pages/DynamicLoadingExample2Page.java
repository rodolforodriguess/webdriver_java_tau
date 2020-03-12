package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By start = By.cssSelector("#start button");
    private By text = By.cssSelector("#finish h4");

    public DynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(start).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(text), "Hello World!"));
    }

    public String getLoadedText(){
        return driver.findElement(text).getText();
    }


}
