package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteCheckoutPage {
    private WebDriver driver;
    public CompleteCheckoutPage(WebDriver driver){this.driver=driver;}

    //Element Locators
    private By FinishButton= By.id("finish");

    //Methods for interactions
    public void pressOnFinishButton(){
        driver.findElement(FinishButton).click();
    }
}
