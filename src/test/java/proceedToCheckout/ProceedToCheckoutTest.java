package proceedToCheckout;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;


@Feature("proceeding to checkout feature")
public class ProceedToCheckoutTest extends BaseTest {
    @Test (description = "Test proceeding to checkout")
    @Description("in this test the user proceeds to his next step in the purchasing process when he goes to checkout")

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
