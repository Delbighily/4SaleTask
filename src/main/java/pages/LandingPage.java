package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;
    public LandingPage(WebDriver driver){this.driver=driver;}


    //Element Locators
    private By UserNameField= By.id("user-name");
    private By PasswordField= By.id("password");
    private By LoginBtn= By.id("login-button");

    //Methods for interactions
    public void fillUserName(){driver.findElement(UserNameField).sendKeys("standard_user");}
    public void fillpassword(){driver.findElement(PasswordField).sendKeys("secret_sauce");}
    public HomePage clickLogin(){
        driver.findElement(LoginBtn).click();
        return new HomePage(driver); }
    }



