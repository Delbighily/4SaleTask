package completingPurchaseTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CompleteCheckoutPage;
import pages.HomePage;
import pages.InformationPage;

public class CompletePurchaseTest extends BaseTest {
    @Test
    public void testFillingData(){
        HomePage homePage= landingPage.clickLogin();
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
        homePage.sortLowToHigh();
        homePage.buyLowestPriceItem();
        CartPage cartPage =homePage.clickCartIcon();
        InformationPage informationPage=cartPage.ProceedCheckout();
        informationPage.fillFirstName();
        informationPage.fillLastName();
        informationPage.fillPostalCode();
        CompleteCheckoutPage completePurchaseTest= informationPage.PressContinue();
        completePurchaseTest.pressOnFinishButton();


        //ASSERTIONS
        Assert.assertTrue(completePurchaseTest.SuccessMessageVisible());
}}
