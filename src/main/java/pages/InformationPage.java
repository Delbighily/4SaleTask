package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage {
    private WebDriver driver;
    public InformationPage(WebDriver driver){this.driver=driver;}


    //Element Locators
    private By FirstNameField=By.id("first-name");
    private By LastNameField=By.id("last-name");
    private By PostalCodeField=By.id("postal-code");
    private By ContinueButton=By.id("continue");


    //Methods for interactions
    public void fillFirstName(){
        driver.findElement(FirstNameField).sendKeys("Test");
    }
    public void fillLastName(){
        driver.findElement(LastNameField).sendKeys("Test");
    }
    public void fillPostalCode(){
        driver.findElement(PostalCodeField).sendKeys("123456");
    }
    public CompleteCheckoutPage PressContinue(){
        driver.findElement(ContinueButton).click();
        return new CompleteCheckoutPage(driver);
    }

}
