package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var HorSlider = homePage.clickSlider();
        HorSlider.MoveSlider(8);
        assertEquals(HorSlider.GetValue(), "4");
    }
}
