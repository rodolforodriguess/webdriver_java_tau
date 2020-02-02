package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.SecureForgotPage;
import static org.testng.Assert.*;


public class forgotPasswordTests extends BaseTests {

    @Test
    public void TestForgotPassword(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        SecureForgotPage secureForgotPage = forgotPassword.FillInEmail("tau@example.com.");
        assertEquals(secureForgotPage.getAlertMsg(), "Your e-mail's been sent!", "Alert text is not right");
    }


}
