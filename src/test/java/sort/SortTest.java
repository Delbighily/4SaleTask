package sort;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.HomePage;


@Feature("Sorting elements based on the price feature")
public class SortTest extends BaseTest {
    @Description("in this test the user sorts the elements viewed based on the price from lowest price to the highest price")
    @Test (description = "Test selecting lowest price item and adding it to cart")
    public void testSuccessSort(){
        HomePage homePage= landingPage.clickLogin();
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
        homePage.sortLowToHigh();
        homePage.buyLowestPriceItem();
        //homePage.clickCartIcon();
    }
}
