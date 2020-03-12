package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().ClickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilTextIsPresent(){
        var loading = homePage.clickDynamicLoading().ClickExample2();
        loading.clickStart();
        assertEquals(loading.getLoadedText(),"Hello World!", "Text is not present yet.");
    }
}
