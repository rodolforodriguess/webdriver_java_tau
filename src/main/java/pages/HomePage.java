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

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
