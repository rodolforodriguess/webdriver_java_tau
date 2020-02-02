package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectOptions.contains(option), "Option not selected");
    }
}
