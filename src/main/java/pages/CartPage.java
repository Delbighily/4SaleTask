package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){this.driver=driver;}

    //Element Locators
    private By CheckoutButton= By.id("checkout");

    //Methods for interactions
    @Step("Click proceed to checkout")
    public InformationPage ProceedCheckout(){
        driver.findElement(CheckoutButton).click();
        return new InformationPage(driver);
    }


}
