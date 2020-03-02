package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextTests extends BaseTests {

    @Test
    public void textContext(){
        var context = homePage.clickContextMenu();
        context.rightClickTextBox();
        assertEquals(context.getText(), "You selected a context menu", "Alert didn't pop up");
        context.AcceptAlert();
    }

}
