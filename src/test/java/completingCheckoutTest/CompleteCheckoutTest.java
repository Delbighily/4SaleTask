package completingCheckoutTest;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CompleteCheckoutPage;
import pages.HomePage;
import pages.InformationPage;


@Feature("Complete checkout scenario")
public class CompleteCheckoutTest extends BaseTest {
    @Description("in this test the user completes the purchase process to the final step and get the confirmation message")
    @Test (description = "Test completing  checkout process")
    public void testFillingData(){
        landingPage.fillUserName();
        landingPage.fillpassword();
        HomePage homePage= landingPage.clickLogin();
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
