package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption() throws InterruptedException {
        var dropDownPage = homePage.clickDropDown();

        dropDownPage.transformDropDown();

        List<String> optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::getDropDownOptions);

        var selectOptions = dropDownPage.getOptionsText();
        assertTrue(selectOptions.containsAll(optionsToSelect), "Check that since some options were not selected");
        assertEquals(selectOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
