package cookies;

import base.BaseTests;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

import static org.testng.Assert.assertFalse;

public class CookieTests extends BaseTests {

    @Test
    public void testCookie(){
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.BuildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
