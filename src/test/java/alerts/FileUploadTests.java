package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() throws IOException {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(new File("./resources/chromedriver.exe").getCanonicalPath());
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Upload didn't go well. Please check this out");
    }
}
