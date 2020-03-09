package wait;

import base.BaseTests;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().DynamicLoadingExample("1");
        loadingPage.clickStart();
    }
}
