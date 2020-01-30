package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    public void closeApplication() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void inputs() throws InterruptedException {
        setUp();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.print(links.size());

        WebElement inputs = driver.findElement(By.cssSelector("a[href=\"/inputs\"]"));
        inputs.click();

        closeApplication();
    }

    public void shifitingContent() throws InterruptedException {
        setUp();

        WebElement shifting = driver.findElement(By.cssSelector("a[href=\"/shifting_content\"]"));
        shifting.click();

        WebElement example1 = driver.findElement(By.cssSelector("a[href=\"/shifting_content/menu\"]"));
        example1.click();

        List<WebElement> nameMenus = driver.findElements(By.cssSelector("#content > div > ul > li > a"));
        System.out.print(nameMenus.size());

        closeApplication();
    }

    public static void main(String args[]) throws InterruptedException {
        BaseTests tests = new BaseTests();
        //tests.inputs();
        tests.shifitingContent();
    }
}
