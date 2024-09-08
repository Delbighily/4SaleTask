package sort;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;

public class SortTest extends BaseTest {
    @Test
    public void testSuccessSort(){
        HomePage homePage= landingPage.clickLogin();
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
        homePage.sortLowToHigh();
    }
}
