package fillInformations;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.InformationPage;


@Feature("Filling information feature")
public class FillingInfoTest extends BaseTest {
    @Description("in this test the user fills the required data to complete the purchase process")
    @Test (description = "Test adding required data in information screen")
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
        informationPage.PressContinue();
    }
}
