package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By inputSlider = By.cssSelector("input[type=\"range\"");
    private By valueInput = By.cssSelector("span#range");

    public HorizontalSlider(WebDriver driver){
        this.driver = driver;
    }

    public void MoveSlider(int times){
        for (int i=0; i<times; i++){
            driver.findElement(inputSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String GetValue(){
        return driver.findElement(valueInput).getText();
    }


}
