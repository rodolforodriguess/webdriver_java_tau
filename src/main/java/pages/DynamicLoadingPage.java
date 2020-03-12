package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By dynamicExample1 = By.cssSelector("div.example  > a:nth-of-type(1)");


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page ClickExample1(){
        driver.findElement(dynamicExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page ClickExample2(){
        driver.findElement(dynamicExample1).click();
        return new DynamicLoadingExample2Page(driver);
    }


}


