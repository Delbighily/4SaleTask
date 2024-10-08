package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {this.driver=driver;}


    //Element Locators
    private By FilterDropDown= By.className("product_sort_container");
    private By Items =By.className("btn_primary");
    private By CartIcon=By.className("shopping_cart_link");


    //Methods for interactions
    @Step
    public void sortLowToHigh(){
    Select objSelect =new Select(driver.findElement(FilterDropDown));
    objSelect.selectByVisibleText("Price (low to high)");
    }
    @Step
    public void buyLowestPriceItem(){
        List<WebElement> products = driver.findElements(Items);
        WebElement element = products.get(0);
        element.click();
    }
    @Step
    public CartPage clickCartIcon(){
        driver.findElement(CartIcon).click();
        return new CartPage(driver);
    }
}
