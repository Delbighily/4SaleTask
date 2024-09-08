package login;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LandingPage;

public class LoginTest extends BaseTest {
    @Test
    public void testSuccessfullLogin(){
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
    }
}
