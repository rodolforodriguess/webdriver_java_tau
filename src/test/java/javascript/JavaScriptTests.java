package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().ScrollToTable();
    }

    @Test
    public void testScrollToFifth(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
