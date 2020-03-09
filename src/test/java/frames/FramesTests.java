package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwigEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text fom editor is incorrect");
    }

    @Test
    public void testNestedFrame(){
        var frames = homePage.clickFrames();
        var nestedFrames = frames.clickNestedFrames();
        String leftFrameText = nestedFrames.switchToLeftFrame();
        assertEquals(leftFrameText, "LEFT", "Text from left frame is incorrect");
        String bottonFrameText = nestedFrames.switchToBottonFrame();
        assertEquals(bottonFrameText, "BOTTOM", "Text from botton frame is incorrect");
    }

}
