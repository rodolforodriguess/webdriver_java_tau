package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    private By options = By.cssSelector("#dropdown option");

    public DropDown(WebDriver driver){
        this.driver = driver;
    }


    public  List<String> getOptionsText(){
        List<WebElement> selectedElements =
                selectDropDownOptions().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void getDropDownOptions(String option){
        selectDropDownOptions().selectByVisibleText(option);
    }

    private Select selectDropDownOptions(){
        return new Select(driver.findElement(dropdown));
    }


    public void transformDropDown(){
        String script = "arguments[0].setAttribute('multiple', '')";
        var jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript(script, chooseDropdown());
    }

    public WebElement chooseDropdown(){
        return driver.findElement(dropdown);
    }






}
