package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By getDynamicExample = By.cssSelector("a[href*='dynamic_loading']");



    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getLinks() {
        List<WebElement> links = driver.findElements(getDynamicExample);
        return links;
    }

    public DynamicLoadingExample1Page ClickExample1(){
        getLinks().get(0);
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page ClickExample2(){
        getLinks().get(1);
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page openNewTab(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(getLinks().get(1))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        return new DynamicLoadingExample2Page(driver);
    }




}


