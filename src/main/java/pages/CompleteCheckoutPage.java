package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class CompleteCheckoutPage {
    private WebDriver driver;
    public CompleteCheckoutPage(WebDriver driver){this.driver=driver;}
    ConfigUtils configUtils=new ConfigUtils();

    //Element Locators
    private By FinishButton= By.id("finish");
    public By SuccessMessage=By.id("checkout_complete_container");

    //Methods for interactions
    @Step
    public void pressOnFinishButton(){
        driver.findElement(FinishButton).click();
    }
    @Step("check the success message")
    public boolean SuccessMessageVisible(){
        return driver.findElement(SuccessMessage).isDisplayed();
}}
