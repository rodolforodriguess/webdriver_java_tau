package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = ("frame-top");
    private String frameBotton = ("frame-bottom");
    private String frameLeft = ("frame-left");
    private By FrameText = By.cssSelector("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToHigherFrame(String frameType) {
        driver.switchTo().frame(frameType);
    }

    public String switchToLeftFrame() {
        switchToHigherFrame(frameTop);
        driver.switchTo().frame(frameLeft);
        String text = getTextFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String switchToBottonFrame() {
        switchToHigherFrame(frameBotton);
        String text = getTextFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextFrame(){
        return driver.findElement(FrameText).getText();
    }




}
