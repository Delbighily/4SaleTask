package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    //Element Locators
    private By FilterDropDown= By.className("product_sort_container");
    private By FirstItem=By.className("btn_primary");
    public HomePage(WebDriver driver) {this.driver=driver;}


    //Methods for interactions
    public void sortLowToHigh(){
    Select objSelect =new Select(driver.findElement(By.className("product_sort_container")));
    objSelect.selectByVisibleText("Price (low to high)");
    }
    public void buyLowestPriceItem(){
        List<WebElement> products = driver.findElements(By.className("btn_primary"));
        WebElement element = products.get(0);
        element.click();

    }
}
