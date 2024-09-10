package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class InformationPage {
    private WebDriver driver;
    public InformationPage(WebDriver driver){this.driver=driver;}
    ConfigUtils configUtils=new ConfigUtils();


    //Element Locators
    private By FirstNameField=By.id("first-name");
    private By LastNameField=By.id("last-name");
    private By PostalCodeField=By.id("postal-code");
    private By ContinueButton=By.id("continue");


    //Methods for interactions
    public void fillFirstName(){
        driver.findElement(FirstNameField).sendKeys(configUtils.getFname());
    }
    public void fillLastName(){
        driver.findElement(LastNameField).sendKeys(configUtils.getLname());
    }
    public void fillPostalCode(){
        driver.findElement(PostalCodeField).sendKeys(configUtils.getPostalCode());
    }
    public CompleteCheckoutPage PressContinue(){
        driver.findElement(ContinueButton).click();
        return new CompleteCheckoutPage(driver);
    }

}
