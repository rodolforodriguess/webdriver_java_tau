package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private By leftFrameText = By.cssSelector("frame[name='frame-left']");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(frameTop);
    }

    public String getTextLeftFrame(){
        return driver.findElement(leftFrameText).getText();
    }




}
