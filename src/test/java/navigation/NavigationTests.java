package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().ClickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }

    @Test
    public void testSwitchTab(){
         homePage.clickMultipleWindows().ClickHere();
         getWindowManager().switchToTaB("New Window");
    }

    @Test
    public void testWindowHoldKeys(){
        var load = homePage.clickDynamicLoading().openNewTab();
        getWindowManager().SwitchToWindow();
        assertFalse(load.returnStartButton().isEmpty(), "Element is not present in the page");

    }
}
