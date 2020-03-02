package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputFied = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By filesUploaded = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form and then clicks on Upload Button
     * @param relativePathOfFile The relative path of file
     */

    public void uploadFile(String relativePathOfFile){
        driver.findElement(inputFied).sendKeys(relativePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(filesUploaded).getText();
    }


}
