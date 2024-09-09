package proceedToCheckout;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class ProceedToCheckoutTest extends BaseTest {
    @Test
    public void testProceedToCheckout(){
        HomePage homePage= landingPage.clickLogin();
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
        homePage.sortLowToHigh();
        homePage.buyLowestPriceItem();
        CartPage cartPage =homePage.clickCartIcon();
        cartPage.ProceedCheckout();
    }
}
