package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage {
        private WebDriver driver;
        //private By formAuthentication = By.linkText();

        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        public LoginPage clickFormAuthentication(){
            clickLink("Form Authentication");
            return new LoginPage(driver);
        }

        public DropDown clickDropDown(){
            clickLink("Dropdown");
            return new DropDown(driver);
        }

        public ForgotPassword clickForgotPassword(){
            clickLink("Forgot Password");
            return new ForgotPassword(driver);
        }

        public HoversPage clickHovers(){
            clickLink("Hovers");
            return new HoversPage(driver);
        }

        public KeyPressesPage clickKeyPresses(){
            clickLink("Key Presses");
            return new KeyPressesPage(driver);
        }

        public HorizontalSlider clickSlider(){
            clickLink("Horizontal Slider");
            return new HorizontalSlider(driver);
        }

        public AlertsPage clickJavaScriptAlerts(){
            clickLink("JavaScript Alerts");
            return new AlertsPage(driver);
        }

        public FileUploadPage clickFileUpload(){
            clickLink("File Upload");
            return new FileUploadPage(driver);
        }

        public ContextMenuPage clickContextMenu(){
            clickLink("Context Menu");
            return new ContextMenuPage(driver);
        }

        public WysiwigEditorPage clickWysiwigEditor(){
            clickLink("WYSIWYG Editor");
            return new WysiwigEditorPage(driver);
        }

        public FramesPage clickFrames(){
            clickLink("Frames");
            return new FramesPage(driver);
        }

        public DynamicLoadingPage clickDynamicLoading(){
            clickLink("Dynamic Loading");
            return new DynamicLoadingPage(driver);
        }

        public LargeAndDeepDomPage clickLargeAndDeepDom(){
            clickLink("Large & Deep DOM");
            return new LargeAndDeepDomPage(driver);
        }

        public InfiniteScrollPage clickInfiniteScroll(){
            clickLink("Infinite Scroll");
            return new InfiniteScrollPage(driver);
         }

         public MultipleWindowsPage clickMultipleWindows(){
            clickLink("Multiple Windows");
            return new MultipleWindowsPage(driver);
         }


        private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
