package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By textBox = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickTextBox(){
        WebElement box = driver.findElement(textBox);
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

    public String getText(){
        return driver.switchTo().alert().getText();
    }

    public void AcceptAlert() {
        driver.switchTo().alert().accept();
    }
}
